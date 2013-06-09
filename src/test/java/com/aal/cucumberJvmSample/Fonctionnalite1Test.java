package com.aal.cucumberJvmSample;

import static org.junit.Assert.*;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsqu;

public class Fonctionnalite1Test {
    private Service service;

    @Etantdonné("^une précondition$")
    public void une_precondition() throws Throwable {
        service = new Service(new Precondition());
    }

    @Lorsqu("^on exécute une action$")
    public void on_execute_une_action() throws Throwable {
        service.executerAction();
    }

    @Alors("^on vérifie la présence d'un résultat$")
    public void on_verifie_la_presence_d_un_resultat() throws Throwable {
        assertEquals(Resultat.class, service.getResultat().getClass());
    }
}
