package learn.java.oop;

public class Main {

    public static void main(String[] args) {
        mobile samsung = new android();
        mobile apple = new Iphone();

        samsung.start();
        samsung.CpuSpeed();
        samsung.stop();

        apple.start();
        apple.CpuSpeed();
        apple.stop();
    }

}

