import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double acum = 0;
        double numero = 0;
        double numeroAcum = 0;

        for (acum = 0; acum >= 11;){

            System.out.println("Diga seu numero: ");
            numero = scanner.nextDouble();

            numeroAcum = numeroAcum + numero;

            acum ++;

        }

        System.out.println("Repetição concluida! Numero final: " + numeroAcum);
            


        }

    }