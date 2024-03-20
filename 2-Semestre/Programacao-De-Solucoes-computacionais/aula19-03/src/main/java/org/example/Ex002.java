package org.example;

public class Ex002 {

//    Somar os numeros pares de 1 a 100
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i < 101 ; i++) {
            if (i%2 == 0) {
                System.out.println(soma + " + " + i + " = " +  (soma += i));
            }
        }
    }
}
