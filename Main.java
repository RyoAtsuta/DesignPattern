import observer_pattern.collector.Collector;
import observer_pattern.collector.DatabaseCollector;
import observer_pattern.collector.ExcelObserver;
import observer_pattern.collector.S3Observer;
import observer_pattern.collector.DataMartObserver1;
import observer_pattern.collector.DataMartObserver2;
import observer_pattern.collector.DataMartObserver3;

public class Main
{
    public static void main(String args[])
    {
        Collector collector = new DatabaseCollector();

        collector.addObserver(new ExcelObserver());
        collector.addObserver(new S3Observer());
        collector.addObserver(new DataMartObserver1());
        collector.addObserver(new DataMartObserver2());
        collector.addObserver(new DataMartObserver3());
        collector.execute();
    }

}