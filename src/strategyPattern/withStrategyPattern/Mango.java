package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategyInterface.VitaminAProvider;

public class Mango extends Fruit{
    Mango(){
        super(new VitaminAProvider());
    }
}
