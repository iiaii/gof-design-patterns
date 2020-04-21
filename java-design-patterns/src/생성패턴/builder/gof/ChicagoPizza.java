package 생성패턴.builder.gof;

import java.util.EnumSet;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(Dough dough, Sauce sauce, EnumSet<Topping> toppings) {
        super(dough, sauce, toppings);
    }

    @Override
    public String toString() {
        return "시카고 피자";
    }
}
