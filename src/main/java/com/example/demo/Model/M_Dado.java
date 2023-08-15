package com.example.demo.Model;


public class M_Dado {
    private int qtdDados;
    private int qtdFaces;

    public int getQtdDados() {
        return qtdDados;
    }

    public void setQtdDados(int qtdDados) {
        this.qtdDados = qtdDados;
    }

    public int getQtdFaces() {
        return qtdFaces;
    }

    public void setQtdFaces(int qtdFaces) {
        this.qtdFaces = qtdFaces;
    }
    public M_Dado(int qtdDados, int qtdFaces) {
        this.qtdDados = qtdDados;
        this.qtdFaces = qtdFaces;
    }
}
