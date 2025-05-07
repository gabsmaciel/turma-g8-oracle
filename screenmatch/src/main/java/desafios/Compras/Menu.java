package desafios.Compras;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao menu de compras");
        System.out.println("Digite o limite do cartão: ");
        double limite = entrada.nextDouble();
        entrada.nextLine();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int continuar = 1;
        while (continuar == 1) {
            System.out.println("Digite o nome do produto: ");
            String descricao = entrada.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = entrada.nextDouble();
            entrada.nextLine();

            Compra compra = new Compra(descricao, valor);

            boolean compraRealizada = cartao.realizarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }


            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            continuar = entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("---------------------------------------");
        System.out.println("Saldo atual: " + cartao.getSaldo()
                + "\nLimite: " + cartao.getLimite());
        System.out.println("---------------------------------------");

        System.out.println("Compras realiazdas (ordernadas por valor): ");
        for (Compra c : cartao.getComprasOrdenadasPorValor()) {
            System.out.println(c);
        }

        System.out.println("Saldo do cartão: R$ " + cartao.getSaldo() + "\n");

        entrada.close();
    }

}
