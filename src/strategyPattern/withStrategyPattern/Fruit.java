package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategyInterface.VitaminStrategy;

public class Fruit{
    VitaminStrategy vitaminStrategy;

    Fruit(VitaminStrategy vitaminStrategy){
        this.vitaminStrategy = vitaminStrategy;
    }
}
