package com.Ycolecao.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConvertTest01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        Integer[] array = lista.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------");

        Integer[] numeros = new Integer[3];

        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;

        List<Integer> list = Arrays.asList(numeros);
        list.set(2, 33);
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        System.out.println("--------------------------------------------");

        List<Integer> numerosLista = new ArrayList<>(Arrays.asList(numeros));
        numerosLista.add(123);
        System.out.println(numerosLista);
    }
}
