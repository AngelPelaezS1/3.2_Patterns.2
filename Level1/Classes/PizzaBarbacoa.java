package Level1.Classes;

import Level1.Interface.PizzaBuilder;

public class PizzaBarbacoa implements PizzaBuilder {

    private  int size = 30;
    private String dough = "Classic";
    private String toppings = "Cheese, Bacon, BBQ Sauce";

    @Override
    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        return this;
    }

    @Override
    public PizzaBuilder setToppings(String topping) {
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}