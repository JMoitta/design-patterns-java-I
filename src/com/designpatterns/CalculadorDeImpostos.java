package com.designpatterns;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQuaquer) {
        double imposto = impostoQuaquer.calcula(orcamento);
        System.out.println(imposto);
    }

}
