package observer_pattern.collector;

public class Database {
    
    public String databaseName;
    public String userName;
    public String password;
    
    public Database(String databaseName, String userName, String password) {
        this.databaseName = databaseName;
        this.userName = userName;
        this.password = password;
    }

}