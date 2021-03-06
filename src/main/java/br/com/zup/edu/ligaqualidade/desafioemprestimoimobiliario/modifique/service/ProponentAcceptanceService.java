package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.service;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent.MainProponentRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent.NumberOfProponentsRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent.ProponentAcceptanceRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent.ProponentsAgeRule;

import java.util.List;

public class ProponentAcceptanceService {

    private final List<ProponentAcceptanceRule> rules;

    public ProponentAcceptanceService() {
        rules = List.of(new MainProponentRule(), new NumberOfProponentsRule(), new ProponentsAgeRule());
    }

    public boolean accept(List<Proponent> proponents) {
        return rules.stream().allMatch(rule -> rule.accept(proponents));
    }
}
