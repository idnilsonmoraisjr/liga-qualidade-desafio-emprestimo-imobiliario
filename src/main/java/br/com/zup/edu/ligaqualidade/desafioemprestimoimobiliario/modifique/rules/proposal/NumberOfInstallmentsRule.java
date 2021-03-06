package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;

public class NumberOfInstallmentsRule implements ProposalAcceptanceRule {

    private static final Integer TWO_YEARS_IN_MONTHS = 24;
    private static final Integer FIFTEEN_YEARS_IN_MONTHS = 180;

    @Override
    public boolean accept(Proposal proposal) {
        return proposal.getMonthlyInstallments() >= TWO_YEARS_IN_MONTHS &&
                proposal.getMonthlyInstallments() <= FIFTEEN_YEARS_IN_MONTHS;
    }
}
