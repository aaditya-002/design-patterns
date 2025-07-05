import decoratorPattern.Pizza;
import decoratorPattern.basePizzas.MargrettaPizza;
import decoratorPattern.decorator.ExtraCheezeDecorator;
import decoratorPattern.decorator.ExtraToppingsDecorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargrettaPizza();
        Pizza extraCheeze = new ExtraCheezeDecorator(pizza);
        Pizza orderedPizza = new ExtraToppingsDecorator(extraCheeze);

        System.out.println(orderedPizza.cost());
    }
}