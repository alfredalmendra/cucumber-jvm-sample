package com.aal.cucumberJvmSample;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Resultat> resultats = new ArrayList<Resultat>();

    public Service(Precondition precondition) {
    }

    public Service(List<Precondition> preconditions) {
    }

    public void executerAction() {
        resultats.add(new Resultat());
    }

    public List<Resultat> getResultats() {
        return resultats;
    }

}
