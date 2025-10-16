package factory.method;

public class AmericanPizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new AmericanCheesePizza();
    }
}