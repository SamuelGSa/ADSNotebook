import java.util.Scanner;

public class Ex004 {
//    Faça um algoritmo que solicite ao usuario que digite um numero de 1 a 7.
//    Utilizando switch, informe a esse usuario qual o dia da semana correspondente ao numero
//    Se for informado qualquer numero diferente, imprima uma mensagem de opção inválida.


    public static void main(String[] args) {
        Integer escolha;
        do {
            System.out.print("Escolha um numero para saber qual dia da semana ele representa \n" +
                    "ou digite 0 para sair: ");
            escolha = scanner().nextInt();

            switch (escolha) {
                case 1 -> System.out.println("Segunda feira!");
                case 2 -> System.out.println("Terça feira!");
                case 3 -> System.out.println("Quarta feira!");
                case 4 -> System.out.println("Quinta feira!");
                case 5 -> System.out.println("Sexta feira!");
                case 6 -> System.out.println("Sabado feira!");
                case 7 -> System.out.println("Domingo feira!");
                case 0 -> System.out.println("Até Logo!");
                default -> System.out.println("Opção inválida");
            }
        }while (!escolha.equals(0));


    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }


}