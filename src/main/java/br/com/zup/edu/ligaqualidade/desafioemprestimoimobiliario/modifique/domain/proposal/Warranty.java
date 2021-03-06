package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;

public class Warranty {

    private final Integer id;
    private final BigDecimal value;
    private final String province;

    public Warranty(Integer id, BigDecimal value, String province) {
        this.id = id;
        this.value = value;
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getProvince() {
        return province;
    }
}
