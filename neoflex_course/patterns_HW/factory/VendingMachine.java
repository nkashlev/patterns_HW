package patterns_HW.factory;

public class VendingMachine {

    public void drinkCoffee(CoffeeType coffeeType) throws IllegalAccessException {
        FactoryCoffee factoryCoffee = new FactoryCoffee();
        Coffee coffee = factoryCoffee.getCoffee(coffeeType);
        System.out.println("ß ïüþ " + coffee.pourCoffee());
    }
}
