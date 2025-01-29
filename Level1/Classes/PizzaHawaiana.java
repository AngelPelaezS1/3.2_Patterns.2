package Level1.Classes;

import Level1.Interface.PizzaBuilder;

public class PizzaHawaiana implements PizzaBuilder {

    private  int size;
    private  String dough;
    private  String toppings;

    @Override
    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(String topping) {
        this.toppings = topping;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}
