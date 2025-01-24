package strategyPattern.withoutStrategyPattern;

public class Orange extends Fruit{
    @Override
    public void provideVitamin(){
        System.out.println("Vitamin C");    //Duplicate Code
    }
}
