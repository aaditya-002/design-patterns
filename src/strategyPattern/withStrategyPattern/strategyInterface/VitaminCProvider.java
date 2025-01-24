package strategyPattern.withStrategyPattern.strategyInterface;

public class VitaminCProvider implements VitaminStrategy{
    @Override
    public void provideVitamin(){
        System.out.println("Vitamin C");
    }
}
