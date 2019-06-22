package learn.java.oop;

public abstract class mobile {
    public abstract void start();

    public void stop() {
        System.out.println("HELLO AM STOPPING");
    }

    public abstract void CpuSpeed();


}

class android extends mobile {


    @Override
    public void start() {
        System.out.println("Hi Android");


    }

    @Override
    public void CpuSpeed() {
        CPU cpu = new CPU();
        int speed = cpu.speed = 2000;
        Integer intObj2 = new Integer("25");
        System.out.println("CPU Speed :" + speed + intObj2 + "");
    }
}

class Iphone extends mobile {

    @Override
    public void start() {
        System.out.println("Hi IOS");

    }

    @Override
    public void CpuSpeed() {
        CPU cpu = new CPU();
        int speed = cpu.speed = 3000;
        System.out.println("CPU Speed : " + speed + "");
    }

}

class CPU {

    int speed = 1000;

    public int getSpeed() {
        return speed;
    }
}