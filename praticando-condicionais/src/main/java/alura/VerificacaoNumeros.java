package alura;

import java.util.Scanner;

public class VerificacaoNumeros {

    public static void main(String[] args) {
        verificarNumero();
    }
    public static void verificarNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        entrada.close();
    }
}
