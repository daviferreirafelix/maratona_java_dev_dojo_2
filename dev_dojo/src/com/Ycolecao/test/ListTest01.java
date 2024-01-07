package com.Ycolecao.test;

import com.Ycolecao.dominio.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("David");
        nomes.add("Porr");

        nomes2.add("Antonio");
        nomes2.add("Carai");

        for (String nome : nomes2) {
            if (!nomes.contains(nome)) {
                nomes.add(nome);
            }
        }

        for (String nome: nomes){
            System.out.println(nome);
        }

        Celular c1 = new Celular("123A", "iPhone");
        Celular c2 = new Celular("456B", "Samsung");
        Celular c3 = new Celular("456B", "Samsung");

        List<Celular> cels = new ArrayList<>();

        cels.add(c1);
        cels.add(c2);
        cels.add(c3);

        System.out.println(cels.contains(c2));

        int i = cels.indexOf(c3);
        System.out.println(i);

    }
}
