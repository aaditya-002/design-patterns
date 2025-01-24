package strategyPattern.withStrategyPattern.strategyInterface;

public class VitaminAProvider implements VitaminStrategy{
    @Override
    public void provideVitamin(){
        System.out.println("Vitamin A");
    }
}
