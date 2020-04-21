package 생성패턴.builder.gof;

public class PizzaStoreOwner {
    PizzaMaker pizzaMaker;
    Pizza pizza;

    public PizzaStoreOwner(PizzaMaker pizzaMaker) {
        this.pizzaMaker = pizzaMaker;
    }

    public Pizza getPizza() {
        System.out.println("피자집 사장님 : 주문 받았습니다!");
        pizza = pizzaMaker.bakePizza();
        System.out.println("피자집 사장님 : 주문하신 "+pizza.toString()+" 나왔습니다!");
        return pizza;
    }
}
