package learn.java.oop;

public abstract class mobile {
    public abstract void start();

    private void stop() {
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
        System.out.println("CPU Speed :" + speed + "");

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