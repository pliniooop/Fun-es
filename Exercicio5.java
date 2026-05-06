public class Exercicio5 {

    public static void main(String[] args) {
        // Exemplos de teste
        System.out.println(exibirDiaSemana(1)); // Saída: domingo
        System.out.println(exibirDiaSemana(2)); // Saída: segunda
        System.out.println(exibirDiaSemana(8)); // Saída: Dia da semana inválido
    }

    /**
     * Retorna o nome do dia da semana baseado em um número de 1 a 7.
     * @param dia Número do dia.
     * @return String com o nome do dia ou mensagem de erro.
     */
    public static String exibirDiaSemana(int dia) {
        String resultado;

        switch (dia) {
            case 1:
                resultado = "domingo";
                break;
            case 2:
                resultado = "segunda";
                break;
            case 3:
                resultado = "terça";
                break;
            case 4:
                resultado = "quarta";
                break;
            case 5:
                resultado = "quinta";
                break;
            case 6:
                resultado = "sexta";
                break;
            case 7:
                resultado = "sábado";
                break;
            default:
                resultado = "Dia da semana inválido";
                break;
        }

        return resultado;
    }
}