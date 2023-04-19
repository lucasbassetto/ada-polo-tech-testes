package com.example.aulajunit01;

public class Calculadora {

    public int somar(int x, int y) {
        return x + y;
    }

    public int subtrair(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        int r = c.somar(1, 2);
        System.out.println(r);

    }





}
