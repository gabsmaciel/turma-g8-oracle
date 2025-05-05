package alura;

import java.util.Scanner;

public class VerificarDoacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = entrada.nextInt();

        System.out.println("Digite o peso do doador: ");
        double peso = entrada.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.print("O doador é compativel para a doação");
        } else {
            System.out.println("O doador não é compatível: Motivo: ");
            if (!idadeValida) {
                System.out.println("- O doador não é compativel com a idade");
            } if (!pesoValido) {
                System.out.println("- Deve pesar mais que 50Kg");
            };
        }
        entrada.close();
    }
}
