package alura;

import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: ");
        int valor = entrada.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor" + valor + "está dentro do intervalo.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo.");
        }
        entrada.close();
    }
}
