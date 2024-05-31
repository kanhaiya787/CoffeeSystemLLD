package Model;

public class MochaCoffee extends Coffee {
    CoffeeSize coffeeSize;
    public MochaCoffee(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    @Override
    public int price() {
            if(coffeeSize == CoffeeSize.SMALL)
                return 150;
            else if(coffeeSize == CoffeeSize.MEDIUM)
                return 200;
            else
                return 250;
    }

    @Override
    public String description() {
        return "Mocha Coffee ";
    }
}
