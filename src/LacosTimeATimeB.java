import java.util.Scanner;

public class LacosTimeATimeB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String timeA;
        String timeB;
        int i;

        String[] nomesA = new String[5];
        String[] nomesB = new String[5];



        System.out.println("Informe o nome do time A: ");
        timeA = scanner.nextLine();
        System.out.println("Informe o nome do time B: ");
        timeB = scanner.nextLine();

        System.out.println("Informe os nomes dos 5 jogadores do time " + timeA + ": ");
        for(i = 0; i < 5; i++) {
            System.out.println("Informe o nome do jogador nº " + (i + 1) + ": ");
            nomesA[i] = scanner.nextLine();
        }

        System.out.println("Informe os nomes dos 5 jogadores do time " + timeB + ": ");
        for(i = 0; i < 5; i++) {
            System.out.println("Informe o nome do jogador nº " + (i + 1) + ": ");
            nomesB[i] = scanner.nextLine();
        }

        System.out.println("Participam do time " + timeA + ": ");
        for(i = 0; i < 5; i++) {
            System.out.println(nomesA[i]);
        }

        System.out.println("Participam do time " + timeB + ": ");
        for(i = 0; i < 5; i++) {
            System.out.println(nomesB[i]);
        }

        scanner.close();
    }
}