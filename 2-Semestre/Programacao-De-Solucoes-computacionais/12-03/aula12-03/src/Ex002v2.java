import java.util.Scanner;

public class Ex002v2 {

    public static void main(String[] args) {

        menu();
        Integer escolha;

        do {
            System.out.println("Escolha uma opção: ");
             escolha = scanner().nextInt();

            if (escolha.equals(1)) {
                System.out.println("Joaozinho Maria de Melo Rego");
            }
            if (escolha.equals(2)) {
                System.out.println("joaozinhoDoLeite@icloud.com");
            }
        }while (escolha != 4);


    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("===== MENU =====");
        System.out.println("1 = Imprimir o meu nome");
        System.out.println("2 = Imprimir meu e-email");
        System.out.println("3 = Imprimir meu e-email");
        System.out.println("4 = Encerrar o programa");
    }
}