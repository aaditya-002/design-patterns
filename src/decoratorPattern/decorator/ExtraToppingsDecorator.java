package decoratorPattern.decorator;

import decoratorPattern.Pizza;

public class ExtraToppingsDecorator extends PizzaDecorator{

    private final Pizza pizza;

    public ExtraToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 20;
    }
}
