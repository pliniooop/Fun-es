public class Exercicio6 {

    // (a) retorna o maior valor do vetor
    public static int encontrarMax(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    // (b) retorna o menor valor do vetor
    public static int encontrarMin(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }

    // (c) retorna (max + min) / 2
    public static double calcularMedia(int[] vetor) {
        int max = encontrarMax(vetor);
        int min = encontrarMin(vetor);
        return (max + min) / 2.0;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 5, 8, 20, 3};

        int maior = encontrarMax(numeros);
        int menor = encontrarMin(numeros);
        double media = calcularMedia(numeros);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Media (max + min)/2: " + media);
    }
}