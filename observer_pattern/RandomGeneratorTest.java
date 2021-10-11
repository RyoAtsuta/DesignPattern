package observer_pattern;

import observer_pattern.random_generator.RandomNumberGenerator;
import observer_pattern.random_generator.DigitObserver;
import observer_pattern.random_generator.GraphObserver;
import observer_pattern.random_generator.NumberGenerator;
import observer_pattern.random_generator.Observer;
import observer_pattern.random_generator.EnglishObserver;

public class RandomGeneratorTest
{
    public void execute()
    {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new EnglishObserver();
        Observer observer3 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}