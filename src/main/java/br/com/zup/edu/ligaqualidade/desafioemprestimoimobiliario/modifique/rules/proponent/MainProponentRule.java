package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Proponent;

import java.util.List;

public class MainProponentRule implements ProponentAcceptanceRule {

    @Override
    public boolean accept(List<Proponent> proponents) {
        return proponents.stream()
        		.filter(Proponent::getMain).count() == 1;
    }
}
