import java.util.Scanner;

public class Ex003 {
//    Elabore um programa que solicite ao usuario que digite 2 numeros inteiros e apos ele,
//    escolha uma operacao a realizar, conforme segue:
//    A - Adição
//    B - Subtracao
//    M - Multiplicacao
//    D - Divisao
//    Mostre o resultado da operação realizada


    public static void main(String[] args) {

        menu();
        Integer primeiroNumero ;
        Integer segundoNumero;
        String escolha;

        do {

            try {

                System.out.print("Digite o primeiro numero inteiro: ");
                primeiroNumero = scanner().nextInt();
                System.out.print("Digite o segundo numero inteiro: ");
                segundoNumero = scanner().nextInt();
                System.out.print("Escolha uma opção: ");
                escolha = scanner().next().toUpperCase();

            }catch (Exception e) {
                throw new RuntimeException("Não é possivel somar letras. :(");
            }

            switch (escolha) {
                case "A" -> System.out.println("A Soma é: " + (primeiroNumero + segundoNumero));
                case "S" -> System.out.println("A subtração é: " + (primeiroNumero - segundoNumero));
                case "M" -> System.out.println("A multiplicacao é: " + (primeiroNumero * segundoNumero));
                case "D" -> {
                    if (segundoNumero.equals(0)) {
                        System.out.println("Não é possivel fazer divisão por zero!");
                    } else {
                        float resultado = ((float) primeiroNumero / segundoNumero);
                        System.out.println("A divisao é: " + resultado);
                    }
                }
                case "H" -> System.out.println("Foi um prazer tê-lo conosco! Até Logo ...");
                default -> System.out.println("Opção inválida!");
            }

                System.out.println("===== ~~~~ =====");
        }while (!escolha.equals("H"));


    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("===== MENU =====");
        System.out.println("A - Adição");
        System.out.println("S - Subtracao");
        System.out.println("M - Multiplicacao");
        System.out.println("D - Divisao");
        System.out.println("H - Para sair");
        System.out.println("===== ~~~~ =====");
    }
}