package org.example;

import java.util.Scanner;

public class ex001 {
// Faça um algoritmo que pergunte ao usuario a sua idade
// e informa se o usuario e maior ou menor de idade

    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        int idade = scanner().nextInt();
        validaIdade(idade);
    }

     static Scanner scanner() {
        return new Scanner(System.in);
    }

    static void validaIdade(int idade) {
        if (idade > 17) {
            System.out.println("Maior de idade. Bora tomar uma!");
        } else if (idade < 0) {
            System.out.println("Idade negativa? Oloco! Tente novamente!");
        } else {
            System.out.println("Menor de idade. Danone com biscoito");
        }
    }
}
