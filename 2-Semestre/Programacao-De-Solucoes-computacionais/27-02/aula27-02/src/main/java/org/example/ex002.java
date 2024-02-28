package org.example;

import java.util.Scanner;

public class ex002 {
// Faça um algoritmo que pergunte ao usuario a sua idade
// e informa se o usuario e maior ou menor de idade

    public static void main(String[] args) {
        System.out.print("Olá. Gostaria de saber meu nome? (1= sim / 2= nao) ");
        int resposta = scanner().nextInt();
        validaResposta(resposta);
    }

    static Scanner scanner() {
        return new Scanner(System.in);
    }

    static void validaResposta(Integer resposta) {
        if (resposta.equals(1)) {
            System.out.println("Meu nome é Samuel!");
        }
    }
}