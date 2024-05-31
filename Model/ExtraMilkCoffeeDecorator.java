package Model;

public class ExtraMilkCoffeeDecorator extends CoffeeDecorator{
    Coffee coffee;
    public ExtraMilkCoffeeDecorator(Coffee coffee) {
        this.coffee=coffee;
    }

    @Override
    public int price() {
        return coffee.price()+20;
    }

    @Override
    public String description() {
        return coffee.description()+ "Extra Milk ";
    }
}
