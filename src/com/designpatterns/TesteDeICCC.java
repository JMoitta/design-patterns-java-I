package com.designpatterns;

public class TesteDeICCC {
    public static void main(String[] args) {
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(3001);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        calculador.realizaCalculo(orcamento, iccc);
    }
}
