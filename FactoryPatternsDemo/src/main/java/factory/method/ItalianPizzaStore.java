package factory.method;

public class ItalianPizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new ItalianCheesePizza();
    }
}