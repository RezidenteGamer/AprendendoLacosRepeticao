import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 0;
        String[] tarefas = {"Limpar a casa", "Programar", "Correr", "Cozinhar", "Tomar banho"};

        while(opcao != 9){
            System.out.println("Menu Unipar");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Contar");
            System.out.println("6 - Sortear um tarefa");
            System.out.println("9 - SAIR");
            opcao = scanner.nextInt();

                if(opcao == 1){
                    System.out.println("Informe o primeiro valor: ");
                    int primeiroValor;
                    primeiroValor = scanner.nextInt();
                    System.out.println("Informe o segundo valor: ");
                    int segundoValor;
                    segundoValor = scanner.nextInt();
                    int resultado = primeiroValor + segundoValor;

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("A soma entre " + primeiroValor + "+" + segundoValor + " é " + resultado);
                    System.out.println("-----------------------------------------------------------");
                }else if(opcao == 2){

                    System.out.println("Informe o primeiro valor: ");
                    int primeiroValor;
                    primeiroValor = scanner.nextInt();
                    System.out.println("Informe o segundo valor: ");
                    int segundoValor;
                    segundoValor = scanner.nextInt();
                    int resultado = primeiroValor - segundoValor;

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("A soma entre " + primeiroValor + "+" + segundoValor + " é " + resultado);
                    System.out.println("-----------------------------------------------------------");
                }else if(opcao == 3){
                    

                    System.out.println("Informe o primeiro valor: ");
                    int primeiroValor;
                    primeiroValor = scanner.nextInt();
                    System.out.println("Informe o segundo valor: ");
                    int segundoValor;
                    segundoValor = scanner.nextInt();
                    int resultado = primeiroValor * segundoValor;

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("A soma entre " + primeiroValor + "+" + segundoValor + " é " + resultado);
                    System.out.println("-----------------------------------------------------------");
                }else if(opcao == 4){
                    

                    System.out.println("Informe o primeiro valor: ");
                    int primeiroValor;
                    primeiroValor = scanner.nextInt();
                    System.out.println("Informe o segundo valor: ");
                    int segundoValor;
                    segundoValor = scanner.nextInt();
                    int resultado = primeiroValor / segundoValor;

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("A soma entre " + primeiroValor + "+" + segundoValor + " é " + resultado);
                    System.out.println("-----------------------------------------------------------");
                }else if(opcao == 5){
                    System.out.println("Até quanto você deseja contar? ");
                    int contar = scanner.nextInt();

                    for(int i = 0; i <= contar; i++){
                        System.out.println(i);
                    }
                }else if(opcao == 6){

                    int valorRandomico = (int) (Math.random() * tarefas.length);
                
                    String negrito = "\u001B[1m";
                    String reset = "\u001B[0m";
                    
                    System.out.println("=================");
                    System.out.println(negrito + tarefas[valorRandomico] + reset);
                    System.out.println("=================");
    

                }else{
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Insira um valor valido!!!");
                    System.out.println("-----------------------------------------------------------");
                }
            }

            System.out.println("Você saiu!");

        }

    }
