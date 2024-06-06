import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}