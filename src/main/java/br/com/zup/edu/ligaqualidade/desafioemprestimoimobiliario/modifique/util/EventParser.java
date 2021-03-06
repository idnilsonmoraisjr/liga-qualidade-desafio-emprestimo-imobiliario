package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.util;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event.EventAction;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.event.EventSchema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class EventParser {

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");

    private EventParser() {
    }

    public static Event parse(String message) throws ParseException {
        if (message == null) return null;

        String[] info = message.split(",");

        return buildFrom(Arrays.asList(info));
    }

    private static Event buildFrom(List<String> info) throws ParseException {
        return new Event(
                Integer.valueOf(info.get(0)),
                EventSchema.valueOf(info.get(1)),
                EventAction.valueOf(info.get(2)),
                FORMAT.parse(info.get(3)),
                info.subList(4, info.size() - 1));
    }

    public static Date parseDate(String value) throws ParseException {
        return FORMAT.parse(value);
    }
}
