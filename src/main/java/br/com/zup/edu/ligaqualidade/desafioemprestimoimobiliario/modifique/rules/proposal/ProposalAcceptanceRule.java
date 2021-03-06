package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proposal;

public interface ProposalAcceptanceRule {

    boolean accept(Proposal proposal);
}
