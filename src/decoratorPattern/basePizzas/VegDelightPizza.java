package decoratorPattern.basePizzas;

import decoratorPattern.Pizza;

public class VegDelightPizza extends Pizza {
    private static final int VEG_DELIGHT_PRIZE = 100;
    @Override
    public int cost(){
        return VEG_DELIGHT_PRIZE;
    }

    public VegDelightPizza() {
    }
}
