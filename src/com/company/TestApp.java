package com.company;

import java.util.Arrays;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        /*Sum sum = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };*/
        // lub z uzyciem lambdy

        Sum sum = (a, b)-> a + b;
        System.out.println(sum.calculate(2,5));

        System.out.println("==========================");

        Factor factor = a -> a * a;
        System.out.println(factor.factor(8));

        System.out.println("==========================");

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        integerList.forEach(element-> System.out.println(element));

        System.out.println("==========================");

        integerList.forEach(element->{
            int x =5;
            element += x;
            System.out.println(element *10); //kod wielolinijkowy w lambda

        });

        System.out.println("==========================");
        System.out.println("==========================");


        NothingSpecial ns = () -> printMessage();//instancja interfejsu, zapis bez paramaterów ->()
        ns.nothing();

    }

    private static void printMessage(){
        System.out.println("Hello");

    }
}
