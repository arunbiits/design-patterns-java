package io.arun.learning.design.core.creational.singleton.example1;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization obj;

    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getObj() {
        if(obj == null) {
            synchronized (SingletonLazyInitialization.class) {
                obj = new SingletonLazyInitialization();
            }
        }
        return obj;
    }

}
