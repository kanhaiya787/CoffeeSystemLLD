package Model;

import java.util.ArrayList;

public interface CoffeeService {
    public Coffee orderCoffee(ArrayList<String> addons, CoffeeType coffeeType, CoffeeSize size);
}
