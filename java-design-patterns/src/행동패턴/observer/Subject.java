package 행동패턴.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new LinkedList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            System.out.println("-------------");
            observer.update();
            System.out.println("-------------");
        }
    }
}
