package com.example.singleton;

import com.example.singleton.example.EagerClass;
import com.example.singleton.example.LazyClass;

public class Application {
    public static void main(String[] args) {
        LazyClass lazyClass = LazyClass.getInstance();
        lazyClass.simpleMethod();

        EagerClass eagerClass = EagerClass.getInstance();
        eagerClass.simpleMethod();
    }
}
