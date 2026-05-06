import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("--- Teste de Números Pares ---");
        System.out.println("Digite um número (ou um número negativo para sair):");

        // Loop para ficar pedindo números ao usuário
        while (true) {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();

            // Condição de parada opcional (ex: sair se digitar um negativo)
            if (numero < 0) {
                break;
            }

            // Chama o método isPar e imprime o resultado baseado no retorno
            if (isPar(numero)) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }

        System.out.println("Programa encerrado.");
        leitor.close();
    }

    /**
     * Método que verifica se um número é par.
     * @param numero O número inteiro de entrada.
     * @return true se for par, false se for ímpar.
     */
    public static boolean isPar(int numero) {
        // Se o resto da divisão por 2 for 0, retorna true
        return numero % 2 == 0;
    }
}