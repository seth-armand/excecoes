package coisasaula.execoes;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EscolherNome {
    
    public class IndiceInvalidoException extends Exception {
    public IndiceInvalidoException(String message) {
        super(message);
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};

        try {
            System.out.println("Escolha um índice (0-2) para os nomes: Lucas, Enzo, Eloisa");
            int indice = scanner.nextInt();

            if (indice < 0 || indice >= nomes.length) {
                throw new IndiceInvalidoException("Índice inválido.");
            }

            System.out.println("Nome escolhido: " + nomes[indice]);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } catch (IndiceInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
