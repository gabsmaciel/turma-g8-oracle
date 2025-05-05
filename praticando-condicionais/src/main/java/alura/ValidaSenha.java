package alura;

import java.util.Scanner;

public class ValidaSenha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senhaCorreta = 123456;

        System.out.println("Digite a senha: ");
        int tentativa = entrada.nextInt();

        if(senhaCorreta == tentativa) {
            System.out.println("Acesso permitido");
        } else  {
            System.out.println("Acesso negado!");
        }
        
        entrada.close();
    }
}
