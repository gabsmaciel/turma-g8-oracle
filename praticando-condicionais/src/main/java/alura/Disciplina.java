package alura;

import java.util.Scanner;

public class Disciplina {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double media;
        System.out.println("Digite sua nota: ");
        media = entrada.nextDouble();

        if (media >= 7) {
            System.out.println("O estudante teve média e foi aprovado. ");
        } else if (media >= 5.0 && media < 7) {
            System.out.println("O estudante está de recuperação.");
        } else {
            System.out.println("O estudante foi reprovado.");
        }

        entrada.close();
    }
}
