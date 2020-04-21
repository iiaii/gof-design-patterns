package 생성패턴.builder.gof;

import java.util.EnumSet;

public class ChicagoPizzaMaker implements PizzaMaker {
    Pizza pizza;

    @Override
    public Dough setDough() {
        System.out.println("피자 메이커 : 두꺼운 도우를 놓습니다");
        return Dough.THICK;
    }

    @Override
    public Sauce setSauce() {
        System.out.println("피자 메이커 : 시카고 피자 특제 소스를 바릅니다");
        return Sauce.CHICAGO;
    }

    @Override
    public EnumSet<Topping> setToppings() {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        toppings.add(Topping.CHEESE);
        System.out.println("피자 메이커 : 치즈를 올립니다");
        toppings.add(Topping.VEGETABLE);
        System.out.println("피자 메이커 : 야채를 올립니다");
        toppings.add(Topping.MEAT);
        System.out.println("피자 메이커 : 고기를 올립니다");
        return toppings;
    }

    @Override
    public Pizza bakePizza() {
        pizza = new ChicagoPizza(setDough(), setSauce(), setToppings());
        System.out.println("피자 메이커 : 시카고 피자를 굽습니다");
        return pizza;
    }
}
