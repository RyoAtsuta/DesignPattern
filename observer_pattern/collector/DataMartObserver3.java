package observer_pattern.collector;

import java.util.Iterator;

public class DataMartObserver3 implements Observer {
    public void update(Collector collector) {
        Iterator<Database> it = collector.getDatabases().iterator();

        while (it.hasNext()) {
            Database database = (Database)it.next();
            send(database);
        }
    }

    private void send(Database database) {
        System.out.println("========= DataMartObserver3 Send Database ========");
        System.out.println("databaseName = " + database.databaseName);
        System.out.println("userName = " + database.userName);
        System.out.println("password = " + database.password);
        System.out.println("========= End of DataMartObserver3 Send Database ========");
    }
}