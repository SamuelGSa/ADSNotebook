package org.example;

import java.util.Scanner;

public class ex003 {
// Faça um algoritmo que pergunte ao usuario seu peso e altura.
// O Algoritmo deve calcular o IMC e informar a Interpretação

    public static void main(String[] args) {
        System.out.println("Vamos calcular o IMC!");
        System.out.print("Qual o seu peso: ");
        double peso = scanner().nextDouble();

        System.out.print("Qual a sua altura: ");
        double altura = scanner().nextDouble();

        calculaIMC(peso,altura);
    }

    static Scanner scanner() {
        return new Scanner(System.in);
    }

    static void calculaIMC(double peso, double altura) {
        var imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("IMC: Abaixo do Peso");
        }
        else if (imc < 25) {
            System.out.println("IMC: Peso Normal");
        }
        else if (imc < 30) {
            System.out.println("IMC: Acima do peso ");
        }
        else if (imc < 35) {
            System.out.println("IMC: Obseidade Classe 1");
        }
        else if (imc < 40) {
            System.out.println("IMC: Obesidade Classe 2");
        } else {
            System.out.println("IMC: Obesidade Classe 3");
        }
    }

}