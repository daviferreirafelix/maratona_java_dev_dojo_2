package com.Ycolecao.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, Integer> info = new HashMap<>();

        //O map identifica as colecoes com base em chave e valor
        //o map sobrescreve quando uma chave igual é adicionada, mesmo com valor diferente
        //cada chave representa um elemento unico dentro do map, ou seja, a chave é um set
        info.put("Idade", 21);
        info.put("Idade", 23);

        System.out.println(info);

        for (String key : info.keySet()){
            System.out.println(key);
        }

        System.out.println("-----------------------------");

        for (Integer value: info.values()){
            System.out.println(value);
        }
    }
}
