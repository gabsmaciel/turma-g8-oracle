package alura.screenmatch.principal;

import alura.screenmatch.excecao.ErroDeConversaoDeAnoExpection;
import alura.screenmatch.modelando.OmdbService;
import alura.screenmatch.modelando.Titulo;
import alura.screenmatch.modelando.TituloOmdb;


import java.io.IOException;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        String busca = leitura.nextLine();

        try {
            TituloOmdb dadosOmdb = new OmdbService().consultarTitulo(busca);
            Titulo meuTitulo = new Titulo(dadosOmdb);
            System.out.println("Título convertido com sucesso:\n" + meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão de número: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido na busca: " + e.getMessage());
        } catch (ErroDeConversaoDeAnoExpection e) {
            System.out.println(e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro na comunicação com a API: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
        leitura.close();
    }
}
