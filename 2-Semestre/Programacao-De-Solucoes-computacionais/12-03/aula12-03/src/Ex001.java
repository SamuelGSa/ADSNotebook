import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int numero = scanner.nextInt();

        System.out.println(validaNumero(numero) ? "O número é par" : "O número é ímpar");
    }

    public static boolean validaNumero(int numero) {
        return numero %2 == 0;
    }
}
