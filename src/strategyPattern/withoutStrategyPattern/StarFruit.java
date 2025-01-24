package strategyPattern.withoutStrategyPattern;

public class StarFruit extends Fruit{
    @Override
    public void provideVitamin(){
        System.out.println("Vitamin C");    //Duplicate Code
    }
}
