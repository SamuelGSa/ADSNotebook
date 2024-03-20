package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < 11 ; i++) {
            lista.add(i);
        }
        System.out.println(lista);

        for (int i  : lista ) {
            System.out.println(i + " Para cada item da lista");
        }
    }
}