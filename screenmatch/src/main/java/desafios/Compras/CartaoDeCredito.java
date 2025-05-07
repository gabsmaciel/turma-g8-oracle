package desafios.Compras;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras = new ArrayList<>();

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // saldo começa igual ao limite
    }

    public boolean realizarCompra(Compra compra) {
        if (hasSaldoDisponivel(compra.getValor())) {
            saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }

    public boolean hasSaldoDisponivel(double valor) {
        return saldo >= valor;
    }

    public List<Compra> getComprasOrdenadasPorValor() {
        compras.sort((c1, c2) -> Double.compare(c1.getValor(), c2.getValor()));
        return compras;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}