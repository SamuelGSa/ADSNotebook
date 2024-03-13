import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {

        menu();
        System.out.println("Escolha uma opção: ");
        int escolha = scanner().nextInt();

        switch (escolha) {
            case 1 :
                System.out.println("Joaozinho Maria de Melo Rego");
                break;
            case 2 :
            case 3 :
                System.out.println("joaozinhoDoLeite@icloud.com");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("===== MENU =====");
        System.out.println("1 = Imprimir o meu nome");
        System.out.println("2 = Imprimir meu e-email");
        System.out.println("3 = Imprimir meu e-email");
    }
}