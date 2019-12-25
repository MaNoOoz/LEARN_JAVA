
package learn.java.oop;


import learn.java.oop.DesignPattern.Behavioral.ObserverPattern.EventSource;
import learn.java.oop.DesignPattern.Behavioral.ObserverPattern.ResponseHandler;

import java.util.Observable;

public class MainApp {
    public static void main(String[] args) {
        EventSource count = new EventSource();
        count.run();
        Observable observable = new Observable();
        ResponseHandler responseHandler = new ResponseHandler();
        responseHandler.update(observable, args);
        System.out.println("Match number: " + count + observable + args);

    }

}

