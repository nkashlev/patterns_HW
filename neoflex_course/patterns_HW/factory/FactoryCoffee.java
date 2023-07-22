package patterns_HW.factory;

public class FactoryCoffee {
    public Coffee getCoffee(CoffeeType coffeeType) throws IllegalAccessException {
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalAccessException("неверный тип кофе");
        }
        return coffee;
    }
}
