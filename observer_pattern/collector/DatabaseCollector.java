package observer_pattern.collector;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class DatabaseCollector extends Collector {

    private List<Database> databases = new ArrayList<Database>();

    public void execute() {
        // collect something
        List<Database> newDatabases = fetchDatabases();

        notify(newDatabases);
    }

    public List<Database> getDatabases() {
        return databases;
    }

    private void notify(List<Database> newDatabases) {
        databases = newDatabases;
        notifyObservers();
    }

    private List<Database> fetchDatabases() {
        return new ArrayList<Database>(Arrays.asList(
            new Database("databaseName1", "userName1", "password1"),
            new Database("databaseName2", "userName2", "password2")
        ));
    }

}