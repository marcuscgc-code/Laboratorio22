package org.main;

import entity.Cidade;
public class Main{ //Classe principal

public static void main(String[] args) {
    Cidade teste = new Cidade();
    teste.setUf("MA");
    teste.setEstado("Maranhao");
    teste.setNome("Pirapipora");
    System.out.println("funcionamento");
    System.out.println(teste.toString());


    }
}

