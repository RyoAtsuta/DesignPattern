package observer_pattern.random_generator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

abstract public class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();;
 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    abstract public int getNumber();

    abstract public void execute();

}