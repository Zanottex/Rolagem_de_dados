package com.example.demo.Model;

public class M_Resultado {
    private int soma;
    private int maior;
    private int[] resultados;

    public M_Resultado(int soma, int maior, int[] resultados) {
        this.soma = soma;
        this.maior = maior;
        this.resultados = resultados;
    }

    public int getSoma() {
        return soma;
    }

    public int getMaior() {
        return maior;
    }

    public int[] getResultados() {
        return resultados;
    }



}
