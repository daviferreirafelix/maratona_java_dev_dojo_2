package com.Ycolecao.test;

import com.Ycolecao.dominio.Celular;

public class EqualsTest01 {
    public static void main(String[] args) {
        Celular c1 = new Celular("123A", "iPhone");
        Celular c2 = new Celular("123A", "iPhone");

        System.out.println(c1.equals(c2));
    }
}
