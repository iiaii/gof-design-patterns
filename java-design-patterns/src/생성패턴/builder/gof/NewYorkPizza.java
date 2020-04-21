package 생성패턴.builder.gof;

import java.util.EnumSet;

public class NewYorkPizza extends Pizza {
    public NewYorkPizza(Dough dough, Sauce sauce, EnumSet<Topping> toppings) {
        super(dough, sauce, toppings);
    }

    @Override
    public String toString() {
        return "뉴욕 피자";
    }
}
