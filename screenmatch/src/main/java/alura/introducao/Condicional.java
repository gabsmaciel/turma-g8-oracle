package alura.introducao;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2002;
        boolean incluidoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

    }
}
