package com.aal.cucumberJvmSample;

public class Resultat {
    private long id = 1;
    private String status = "done";
    private int value = 36;

    public int getValeurTotale() {
        return value;
    }

    @Override
    public String toString() {
      return String.format("{\"id\":\"%d\", \"status\":\"%s\", \"value\":\"%d\"}", id, status, value);
    }
}
