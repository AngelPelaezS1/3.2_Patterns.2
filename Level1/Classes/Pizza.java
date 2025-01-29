package Level1.Classes;

public class Pizza {
    private int size;
    private String dough;
    private String toppings;

    public Pizza(int size, String dough, String toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public String getTopping() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
