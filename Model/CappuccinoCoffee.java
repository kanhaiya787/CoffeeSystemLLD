package Model;

public class CappuccinoCoffee extends Coffee{

    CoffeeSize coffeeSize;
    public CappuccinoCoffee(CoffeeSize coffeeSize) {
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
           return 100;
       else if(coffeeSize == CoffeeSize.MEDIUM)
           return 150;
       else
           return 200;
    }
    @Override
    public String description() {
        return "Cappuccino Coffee ";
    }



}
