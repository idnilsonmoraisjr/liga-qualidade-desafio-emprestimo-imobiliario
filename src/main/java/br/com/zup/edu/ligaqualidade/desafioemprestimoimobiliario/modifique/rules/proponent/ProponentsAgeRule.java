package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;

import java.util.List;

public class ProponentsAgeRule implements ProponentAcceptanceRule {

    private static final Integer MIN_PROPONENT_AGE = 18;

    @Override
    public boolean accept(List<Proponent> proponents) {
        return proponents.stream().map(Proponent::getAge).allMatch(age -> age >= MIN_PROPONENT_AGE);
    }
}
