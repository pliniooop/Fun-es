import java.util.Scanner;

public class Exercicio3 {

    // Método que retorna o maior valor
    public static int encontrarMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lendo dois números do usuário
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        // Chamando o método
        int maior = encontrarMax(num1, num2);

        // Imprimindo o resultado
        System.out.println("O maior numero é: " + maior);

        scanner.close();
    }
}