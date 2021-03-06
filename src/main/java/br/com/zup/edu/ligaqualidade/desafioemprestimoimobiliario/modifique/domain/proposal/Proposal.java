package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;
import java.util.List;

public class Proposal {

    private final Integer id;
    private final BigDecimal loanValue;
    private final Integer monthlyInstallments;
    private final List<Proponent> proponents;
    private final List<Warranty> warranties;

    public Proposal(Integer id, BigDecimal loanValue, Integer monthlyInstallments, List<Proponent> proponents, List<Warranty> warranties) {
        this.id = id;
        this.loanValue = loanValue;
        this.monthlyInstallments = monthlyInstallments;
        this.proponents = proponents;
        this.warranties = warranties;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getLoanValue() {
        return loanValue;
    }

    public Integer getMonthlyInstallments() {
        return monthlyInstallments;
    }

    public List<Proponent> getProponents() {
        return proponents;
    }

    public List<Warranty> getWarranties() {
        return warranties;
    }
}
