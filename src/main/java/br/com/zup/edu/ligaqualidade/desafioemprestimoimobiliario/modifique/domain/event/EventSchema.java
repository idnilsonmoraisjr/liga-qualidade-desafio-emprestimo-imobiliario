package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event;

public enum EventSchema {

    PROPOSAL("proposal"), PROPONENT("proponent"), WARRANTY("warranty");

    private final String value;

    EventSchema(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}