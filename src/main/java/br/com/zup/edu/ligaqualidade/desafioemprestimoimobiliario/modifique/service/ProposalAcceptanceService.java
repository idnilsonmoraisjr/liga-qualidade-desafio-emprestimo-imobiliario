package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.service;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal.LoanValueRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal.NumberOfInstallmentsRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal.ProposalAcceptanceRule;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal.WarrantiesSumRule;

import java.util.List;

public class ProposalAcceptanceService {

    private final List<ProposalAcceptanceRule> rules;

    public ProposalAcceptanceService() {
        rules = List.of(new LoanValueRule(), new NumberOfInstallmentsRule(), new WarrantiesSumRule());
    }

    public boolean accept(Proposal proposal) {
        return rules.stream().allMatch(rule -> rule.accept(proposal));
    }
}
