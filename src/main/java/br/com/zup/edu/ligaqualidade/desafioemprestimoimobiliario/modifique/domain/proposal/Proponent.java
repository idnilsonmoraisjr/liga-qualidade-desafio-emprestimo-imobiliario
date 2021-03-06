package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.proposal;

import java.math.BigDecimal;

/**
 * - Proponent
 * - id
 * - name
 * - age
 * - monthly_income
 * - main
 */

public class Proponent {

    private final Integer id;
    private final String name;
    private final Integer age;
    private final BigDecimal monthlyIncome;
    private final Boolean main;

    public Proponent(Integer id, String name, Integer age, BigDecimal monthlyIncome, Boolean main) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.main = main;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public Boolean getMain() {
        return main;
    }
}
