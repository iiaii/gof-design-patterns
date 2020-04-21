package 생성패턴.builder.effective_java;

public class PizzaStoreOwner {
    public static void main(String[] args) {
        NewYorkPizza newYorkPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

        ChicagoPizza chicagoPizza = new ChicagoPizza.Builder(ChicagoPizza.HotDegree.VERYHOT)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.PEPPER)
                .addTopping(Pizza.Topping.MUSHROOM)
                .build();

        printToppings(newYorkPizza);
        printToppings(calzonePizza);
        printToppings(chicagoPizza);
    }

    static void printToppings(Pizza pizza) {
        System.out.println("-----------");
        System.out.println(pizza.toString()+"의 토핑");
        pizza.toppings.forEach(System.out::println);
        System.out.println("-----------");
    }
}
