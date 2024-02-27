package org.example;

import java.util.Scanner;

public class ex001 {
// Faça um algoritmo que pergunte ao usuario a sua idade
// e informa se o usuario e maior ou menor de idade

    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        int idade = scanner().nextInt();
        System.out.println(validaIdade(idade));
    }

     static Scanner scanner() {
        return new Scanner(System.in);
    }

    static String validaIdade(int idade) {
        if (idade > 17) {
            return "Maior de idade. Bora tomar uma!";
        } else if (idade < 0) {
            return "Idade negativa? Oloco! Tente novamente!";
        } else {
            return "Menor de idade. Danone com biscoito";
        }
    }
}
