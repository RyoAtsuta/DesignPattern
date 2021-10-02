package observer_pattern.random_generator;

public class EnglishObserver implements Observer {
    public void update(NumberGenerator generator) {
        String[] englishDictionary = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        System.out.println("EnglishObserver:" + englishDictionary[generator.getNumber()]);
    }
}