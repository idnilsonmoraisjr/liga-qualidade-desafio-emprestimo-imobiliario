package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;

import java.util.List;

public interface ProponentAcceptanceRule {

    boolean accept(List<Proponent> proponents);

}
