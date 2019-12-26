package learn.java.oop.DesignPattern.Behavioral.ObserverPattern;

import java.util.Observable;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        EventSource count = new EventSource();
        count.run();
        Observable observable = new Observable();
        ResponseHandler responseHandler = new ResponseHandler();
        responseHandler.update(observable, args);
        System.out.println("Match number: " + count + observable + args);
    }

}
