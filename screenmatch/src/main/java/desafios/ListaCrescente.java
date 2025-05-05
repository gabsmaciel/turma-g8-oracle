package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaCrescente {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
