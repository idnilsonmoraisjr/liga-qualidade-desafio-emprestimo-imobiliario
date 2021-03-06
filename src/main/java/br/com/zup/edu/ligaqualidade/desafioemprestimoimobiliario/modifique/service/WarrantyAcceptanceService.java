package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.service;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.warranty.NumberOfWarrantiesRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.warranty.WarrantyAcceptanceRule;

import java.util.List;

public class WarrantyAcceptanceService {

    private final List<WarrantyAcceptanceRule> rules;

    public WarrantyAcceptanceService() {
        rules = List.of(new NumberOfWarrantiesRule());
    }

    public boolean accept(List<Warranty> warranties) {
        return rules.stream().allMatch(rule -> rule.accept(warranties));
    }
}
