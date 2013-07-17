package com.aal.httpServerSample;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

import com.aal.cucumberJvmSample.Precondition;
import com.aal.cucumberJvmSample.Resultat;
import com.aal.cucumberJvmSample.Service;
import com.google.common.base.Joiner;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HttpServerMain {

    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(System.getenv("PORT"));

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                Service service = new Service(new Precondition());
                service.executerAction();
                List<Resultat> resultats = service.getResultats();

                String body = "[" + Joiner.on(",").join(resultats) + "]";

                String query = exchange.getRequestURI().getQuery();
                if (null != query) {
                    String callback = query.split("[&=]")[1];
                    body = callback + "(" + body + ")";
                }

                byte[] response = body.getBytes();
                exchange.sendResponseHeaders(200, response.length);
                exchange.getResponseBody().write(response);
                exchange.close();
            }
        });
        server.start();
    }

}
