package coisasaula.execoes;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    
    public class OpcaoInvalidaException extends Exception {
        public OpcaoInvalidaException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");

            int opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 3) {
                throw new OpcaoInvalidaException("Opção inválida.");
            }

            System.out.println("Você escolheu a opção " + opcao);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } catch (OpcaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
