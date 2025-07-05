package decoratorPattern.basePizzas;

import decoratorPattern.Pizza;

public class MargrettaPizza extends Pizza {
    private static final int MARGRETTA_PIZZA_PRIZE = 120;
    @Override
    public int cost(){
        return MARGRETTA_PIZZA_PRIZE;
    }

    public MargrettaPizza() {
    }
}
