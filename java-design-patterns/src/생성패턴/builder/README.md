# 빌더 패턴

- 생성 패턴
- 복잡한 객체를 생성하는 방법과 표현하는 방법을 정의하는 클래스를 별도로 분리하여, 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공할 수 있도록 한다.
- Effective Java 의 경우 생성시에 파라미터로 넘겨야한느 값이 많은 경우에 내부클래스로 builder를 두어 메서드체이닝으로 생성


## 예제 : 피자 가게 주문 

1. GoF : 생성과 표현하는 방법을 정의하는 클래스를 분리하여 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절 차를 제공 할 때
- Builder : PizzaMaker (피자 만드는 직원)
- ConcreteBuilder : NewYorkPizzaMaker, ChicagoPizzaMaker
- Director : PizzaStoreOwner (피자집 사장)
- Prodcut : NewYorkPizza, ChicagoPizza
- (AbstractProduct : Pizza (피자))
- (Client : Client) 

2. Effective Java : 객체의 필수 요소(필드)가 많을 때 불변을 보장하면서 깔끔하고 유연하게 객체를 생성할 때
- Pizza 추상 클래스의 내부 추상 클래스 Builder 에게 객체 생성을 맡김 (외부 객체에 종속적)  
- 필수 요소는 생성자로 초기화하고, 나머지 요소들은 자바빈 패턴처럼 요소를 추가하며 초기화하는 방식   


## PizzaStoreOwner(Client) 코드

### Effective Java

- main 

```java
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
```

- 출력

```
-----------
뉴욕 피자의 토핑
ONION
SAUSAGE
-----------
-----------
칼초네 피자의 토핑
HAM
-----------
-----------
시카고 피자의 토핑
HAM
MUSHROOM
ONION
PEPPER
SAUSAGE
-----------
```