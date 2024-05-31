package Model;

public class WhippedCreamCoffeeDecorator extends CoffeeDecorator{
    Coffee coffee;
    public WhippedCreamCoffeeDecorator(Coffee coffee) {
        this.coffee=coffee;
    }

    @Override
    public int price() {
        return coffee.price()+50;
    }


    @Override
    public String description() {
        return coffee.description()+ "Extra Whipped Cream ";
    }
}
