package com.aal.cucumberJvmSample;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsqu;

public class ServiceTest {
    private Service service;

    @Etantdonné("^une précondition$")
    public void une_precondition() throws Throwable {
        service = new Service(new Precondition());
    }

    @Lorsqu("^on exécute (\\d+) actions{0,1}$")
    public void on_execute_N_actions(int nombreOccurences) throws Throwable {
        for (int index = 0; index < nombreOccurences; index++) {
            service.executerAction();
        }
    }

    @Alors("^on vérifie la présence de (\\d+) résultats{0,1}$")
    public void on_verifie_la_presence_de_N_resultats(int nombreOccurences)
            throws Throwable {
        assertEquals(nombreOccurences, service.getResultats().size());
    }

}
