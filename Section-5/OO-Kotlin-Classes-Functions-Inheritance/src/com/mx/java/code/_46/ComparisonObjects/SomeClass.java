package com.mx.java.code._46.ComparisonObjects;

public class SomeClass {

    private static int privateVar = 6;

    public static void main(String[] args) {
        new SomeOtherClass().someOtherMethod();
    }

    public static void accesPrivateVar() {
        System.out.println("Im accesing privateVar " + privateVar);
    }
}
