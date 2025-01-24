package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategyInterface.VitaminCProvider;

public class Orange extends Fruit{
    Orange(){
        super(new VitaminCProvider());
    }
}
