package factory.method;

public abstract class PizzaStore {
    public void orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
    }
    
    // Factory Method — subclasele o vor implementa
    protected abstract Pizza createPizza();
}