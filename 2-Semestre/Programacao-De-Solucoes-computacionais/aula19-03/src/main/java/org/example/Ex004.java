package org.example;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        System.out.print("Digite o valor para calcular o fatorial: ");
        Integer escolha = scanner().nextInt();

        int fatorial = 1;

        for (int i = escolha; i > 1; i--){
            System.out.println(fatorial *= i);

        }

    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
