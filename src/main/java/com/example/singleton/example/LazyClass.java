package com.example.singleton.example;

public class LazyClass {

    private static LazyClass instance;

    private LazyClass() {
    }

    public static synchronized LazyClass getInstance() {
        if (instance == null) {
            instance = new LazyClass();
        }
        return instance;
    }

    public void simpleMethod() {
        System.out.println("Hello Lazy Class");
    }
}

