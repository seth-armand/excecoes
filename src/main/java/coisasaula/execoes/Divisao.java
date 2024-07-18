package coisasaula.execoes;


import java.util.Scanner;

public class Divisao {
    
    public class DivisaoPorZeroException extends Exception {
        public DivisaoPorZeroException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();

            if (denominador == 0) {
                throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
            }

            double resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    } 
}