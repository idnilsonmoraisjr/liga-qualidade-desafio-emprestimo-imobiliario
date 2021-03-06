package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event;

public enum EventAction {

    CREATED("created"), UPDATED("updated"), DELETED("deleted"), ADDED("added"), REMOVED("removed");

    private final String value;

    EventAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
