package Model;

import java.util.ArrayList;

public class CoffeeServiceImpl implements CoffeeService{
    public CoffeeServiceImpl() {
        super();
    }

    @Override
    public Coffee orderCoffee(ArrayList<String> addons, CoffeeType coffeeType, CoffeeSize size){
        Coffee coffee = null;
        try {
            boolean isExtraMilkSelected = addons.contains("Extra Milk");
            boolean isWhippedCreamSelected = addons.contains("Whipped Cream");
            if (coffeeType == CoffeeType.Mocha)
                coffee = new MochaCoffee(size);
            else if (coffeeType == CoffeeType.Cappucchino)
                coffee = new CappuccinoCoffee(size);
            else
                throw new UnknownCoffeeTypeException("Unknown Coffee Type "+coffeeType+" has been selected by customer");
            if (isExtraMilkSelected)
                coffee = new ExtraMilkCoffeeDecorator(coffee);
            if (isWhippedCreamSelected)
                coffee = new WhippedCreamCoffeeDecorator(coffee);
        }
        catch(UnknownCoffeeTypeException e){
           e.printStackTrace();
        }
        return coffee;
    }
}
