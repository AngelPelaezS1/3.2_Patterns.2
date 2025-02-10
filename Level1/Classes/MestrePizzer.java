package Level1.Classes;

import Level1.Interface.PizzaBuilder;

public class MestrePizzer {

        private PizzaBuilder pizzaBuilder;
    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza buildBarbacoaPizza(){
        return pizzaBuilder
                .setSize(30)
                .build();
    }
    public Pizza buildHawaianPizza(){
        return pizzaBuilder
                .setSize(40)
                .build();
    }
}