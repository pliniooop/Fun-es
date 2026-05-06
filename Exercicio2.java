public class Exercicio2 {

    // Função com parâmetro
    public static void imprimeNovaMensagem(String parametro) {
        System.out.println("Meu primeiro programa com funcoes e parametro: " + parametro);
    }

    public static void main(String[] args) {

        // Chamando a função três vezes com valores diferentes
        imprimeNovaMensagem("Pedro");
        imprimeNovaMensagem("Java");
        imprimeNovaMensagem("Aula 1");
    }
}