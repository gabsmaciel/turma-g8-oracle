package alura.introducao;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento: ");
        int ano = leitura.nextInt();
        System.out.println(filme + " é do seguinte ano " + ano);
        System.out.println("Digite a sua avaliação do filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
