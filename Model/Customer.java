package Model;

import java.util.ArrayList;

public class Customer {
    String name;
    String number;
    CoffeeService coffeeService;
    public Customer(String name, String number) {
        this.name = name;
        this.number = number;
        coffeeService = new CoffeeServiceImpl();
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void orderCoffee(){
        try {
            ArrayList<String> al = new ArrayList<>();
            al.add("Extra Milk");
            al.add("Whipped Cream");
            Coffee coffee = coffeeService.orderCoffee(al, CoffeeType.Cappucchino, CoffeeSize.MEDIUM);
            System.out.println("Order: " + coffee.description() + "is Successful for customer " + name + " and total amount is " + coffee.price());
            al.remove("Whipped Cream");
            coffee = coffeeService.orderCoffee(al, CoffeeType.Mocha, CoffeeSize.LARGE);
            System.out.println("Order: " + coffee.description() + " is Successful for customer " + name + " and total amount is " + coffee.price());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
