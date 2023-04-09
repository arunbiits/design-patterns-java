package io.arun.learning.design.core.creational.singleton.example1;

public class SingletonEagerInitialization {

    private static SingletonEagerInitialization obj = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getObj() {
        return obj;
    }

}
