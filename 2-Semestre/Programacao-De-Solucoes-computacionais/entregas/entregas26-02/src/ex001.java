import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para ser comparado: ");
        int numero = scanner.nextInt();

        if (0 > numero) {
            System.out.println("É um número negativo");
        } else {
            System.out.println("É um número positivo");
        }
    }
}