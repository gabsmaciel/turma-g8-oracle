package alura.introducao;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação para o filme " +
                    "ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                contador++;
            }

        }


        System.out.println("Media de avaliações: " + mediaAvaliacao / contador);

    }
}
