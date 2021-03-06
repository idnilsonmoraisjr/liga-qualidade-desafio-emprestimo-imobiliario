package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rules.warranty;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal.Warranty;

import java.util.List;

public interface WarrantyAcceptanceRule {

    boolean accept(List<Warranty> warranties);
}
