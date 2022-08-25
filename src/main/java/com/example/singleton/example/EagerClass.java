package com.example.singleton.example;

public class EagerClass {
    private static EagerClass ins = new EagerClass();

    private EagerClass() {
    }

    public static EagerClass getInstance() {
        return ins;
    }

    public void simpleMethod() {
        System.out.println("Hello Eager Class");
    }
}
