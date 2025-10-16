package factory.method;

public class TestFactoryMethod {
    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD DEMO ===\n");
        
        PizzaStore italianStore = new ItalianPizzaStore();
        PizzaStore americanStore = new AmericanPizzaStore();
        
        System.out.println("Comandă de la magazin italian:");
        italianStore.orderPizza();
        
        System.out.println("\nComandă de la magazin american:");
        americanStore.orderPizza();
        
        System.out.println("\nFactory Method: Fiecare subclasă decide ce obiect creează.");
        System.out.println("Avantaj: Poți adăuga magazine noi FĂRĂ să modifici codul existent!");
    }
}