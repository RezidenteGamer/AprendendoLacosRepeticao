

import java.util.Scanner;

public class AprendendoLacosRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //inicializacao; condicao; incremento
        // ++ -> soma +1

        String[] nomesJogadores = new String[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Informe o nome do Playaer 1" + i);
            nomesJogadores[i] = scanner.next();

        }

    }
}
