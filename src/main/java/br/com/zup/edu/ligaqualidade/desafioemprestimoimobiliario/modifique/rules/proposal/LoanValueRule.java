package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;

import java.math.BigDecimal;

public class LoanValueRule implements ProposalAcceptanceRule {

    private static final BigDecimal MAX_LOAN_VALUE = BigDecimal.valueOf(3_000_000);
    private static final BigDecimal MIN_LOAN_VALUE = BigDecimal.valueOf(30_000);

    @Override
    public boolean accept(Proposal proposal) {
        return proposal.getLoanValue().compareTo(MAX_LOAN_VALUE) < 1 &&
                proposal.getLoanValue().compareTo(MIN_LOAN_VALUE) > -1;
    }
}
