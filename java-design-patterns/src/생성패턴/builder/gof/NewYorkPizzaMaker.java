package 생성패턴.builder.gof;

import java.util.EnumSet;

public class NewYorkPizzaMaker implements PizzaMaker {
    Pizza pizza;

    @Override
    public Dough setDough() {
        System.out.println("피자 메이커 : 얇은 도우를 놓습니다");
        return Dough.THIN;
    }

    @Override
    public Sauce setSauce() {
        System.out.println("피자 메이커 : 뉴욕 피자 특제 소스를 바릅니다");
        return Sauce.NEWYORK;
    }

    @Override
    public EnumSet<Topping> setToppings() {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        toppings.add(Topping.CHEESE);
        System.out.println("피자 메이커 : 치즈를 올립니다");
        toppings.add(Topping.VEGETABLE);
        System.out.println("피자 메이커 : 야채를 올립니다");
        toppings.add(Topping.HAM);
        System.out.println("피자 메이커 : 햄을 올립니다");
        return toppings;
    }

    @Override
    public Pizza bakePizza() {
        pizza = new NewYorkPizza(setDough(), setSauce(), setToppings());
        System.out.println("피자 메이커 : 뉴욕 피자를 굽습니다");
        return pizza;
    }
}
