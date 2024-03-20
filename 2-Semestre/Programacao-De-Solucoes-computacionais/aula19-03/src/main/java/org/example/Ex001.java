package org.example;

public class Ex001 {

    public static void main(String[] args) {
        int numero = 0;

        for (int i = 1; i < 11 ; i++) {
            System.out.println(numero + " + " + i + " = " +  (numero += i));
        }
    }
}
