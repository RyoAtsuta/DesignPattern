package observer_pattern.collector;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Collector {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }
    
    public abstract List<Database> getDatabases();

    public abstract void execute();
}