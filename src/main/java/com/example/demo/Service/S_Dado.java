package com.example.demo.Service;

import com.example.demo.Model.M_Resultado;

import java.util.Random;

public class S_Dado {

    public static M_Resultado Jogada(int Dados, int faces){
        int soma = 0;
        int maior = 0;
        int result;
        Random random = new Random();
       int valores[] = new int[Dados];
       for(int i=0; i<Dados; i++){
           result = random.nextInt(faces)+1;
           valores[i] = result;
           soma = soma+result;
           if(result > maior) {
               maior = faces;
           }
       }
        M_Resultado m_jogada = new M_Resultado(soma,maior,valores);
       return m_jogada;
    }
}
