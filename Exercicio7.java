pedro henrique de carvalho servulo
import java.util.Scanner;

public class Exercicio7 {

    // Método que calcula o fatorial
    public static long calcularFatorial(int n) {
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + " = " + resultado);

        scanner.close();
    }
}
