package 생성패턴.builder.gof;

import java.util.EnumSet;

public abstract class Pizza {
    private Dough dough;
    private Sauce sauce;
    private EnumSet<Topping> toppings;

    public Pizza(Dough dough, Sauce sauce, EnumSet<Topping> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public abstract String toString();
}
