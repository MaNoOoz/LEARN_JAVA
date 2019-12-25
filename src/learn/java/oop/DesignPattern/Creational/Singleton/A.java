package learn.java.oop.DesignPattern.Creational.Singleton;

public class A {
    //    Let's see the example of singleton design pattern using early instantiation.
    private static A obj = new A();//Early, instance will be created at load time

    private A() {
    }

    public static A getA() {
        return obj;
    }

    public void doSomething() {
        //write your code
    }
}
