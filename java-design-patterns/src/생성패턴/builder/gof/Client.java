package 생성패턴.builder.gof;

public class Client {
    public static void main(String[] args) {
        PizzaStoreOwner newYorkPizzaStoreOwner = new PizzaStoreOwner(new NewYorkPizzaMaker());
        System.out.println("손님 : 뉴욕 피자 주문합니다");
        System.out.println("------------------");
        newYorkPizzaStoreOwner.getPizza();
        System.out.println("------------------");

        PizzaStoreOwner chicagoPizzaStoreOwner = new PizzaStoreOwner(new ChicagoPizzaMaker());
        System.out.println("손님 : 시카고 피자 주문합니다");
        System.out.println("------------------");
        chicagoPizzaStoreOwner.getPizza();
        System.out.println("------------------");
    }
}
