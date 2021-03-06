package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;

import java.util.List;

public class NumberOfProponentsRule implements ProponentAcceptanceRule {

    @Override
    public boolean accept(List<Proponent> proponents) {
        return proponents.size() >= 2;
    }

}
