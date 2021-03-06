package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.warranty;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;

import java.util.List;

public class NumberOfWarrantiesRule implements WarrantyAcceptanceRule {

    @Override
    public boolean accept(List<Warranty> warranties) {
        return warranties.size() >= 1;
    }
}
