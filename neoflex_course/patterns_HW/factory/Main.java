package patterns_HW.factory;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.drinkCoffee(CoffeeType.ESPRESSO);
    }
}
