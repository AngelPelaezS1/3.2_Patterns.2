package Level1.Classes;

import Level1.Interface.PizzaBuilder;

public class PizzaHawaiana implements PizzaBuilder {

    private  int size = 25;
    private  String dough = "Italian";
    private  String toppings = "Cheese, Onion, Pineapple";

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