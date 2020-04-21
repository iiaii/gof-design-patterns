package 생성패턴.builder.gof;

import java.util.EnumSet;

public interface PizzaMaker {
    Dough setDough();
    Sauce setSauce();
    EnumSet<Topping> setToppings();
    Pizza bakePizza();
}
