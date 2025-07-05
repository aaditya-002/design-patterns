package decoratorPattern.decorator;

import decoratorPattern.Pizza;

public class ExtraCheezeDecorator extends PizzaDecorator{

    private final Pizza pizza;

    public ExtraCheezeDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 30;
    }
}
