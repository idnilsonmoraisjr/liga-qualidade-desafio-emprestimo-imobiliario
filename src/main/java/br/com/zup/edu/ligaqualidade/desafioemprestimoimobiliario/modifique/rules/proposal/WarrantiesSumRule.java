package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;

import java.math.BigDecimal;

public class WarrantiesSumRule implements ProposalAcceptanceRule {

    @Override
    public boolean accept(Proposal proposal) {
        BigDecimal warrantiesSum = proposal.getWarranties().stream()
                .map(Warranty::getValue)
                .reduce(BigDecimal.ZERO, (subtotal, current) -> current.add(subtotal));
        BigDecimal doubleLoanValue = proposal.getLoanValue().multiply(BigDecimal.valueOf(2));
        return warrantiesSum.compareTo(doubleLoanValue) >= 0;
    }
}
