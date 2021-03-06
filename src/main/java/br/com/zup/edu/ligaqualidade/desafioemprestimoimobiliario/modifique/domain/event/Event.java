package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event;

import java.util.Date;
import java.util.List;

public class Event {

    private final Integer id;
    private final EventSchema schema;
    private final EventAction action;
    private final Date timestamp;
    private final List<String> details;

    public Event(Integer id, EventSchema schema, EventAction action, Date timestamp, List<String> details) {
        this.id = id;
        this.schema = schema;
        this.action = action;
        this.timestamp = timestamp;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public EventSchema getSchema() {
        return schema;
    }

    public EventAction getAction() {
        return action;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public List<String> getDetails() {
        return details;
    }
}
