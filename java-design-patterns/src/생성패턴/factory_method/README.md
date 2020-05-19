# 팩토리 메서드 패턴

- 생성 패턴
- 객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할지에 대한 결정은 서브클래스가 내리도록 한다.
- Effective Java 의 정적 팩토리 메서드 패턴과는 다른 패턴이다. (인스턴스 생성을 메서드로 한다는것은 같음)


## 예제 : 할인 쿠폰, 포인트 예제 

1. GoF : 객체 생성 인터페이스는 미리 정의하고 어떤 인스턴스를 만들지에 대한 결정은 서브클래스에서 내리는 패턴
- Product : Discount
- ConcreteProduct : Coupon, Point
- Creator : Store
- ConcreteCreator : OliveYoung, Lalavla
- (Client : Client)

2. Effective Java : 생성자로 객체를 생성할 때 발생하는 단점을 보완하여 클래스의 static 메서드로 객체 생성을 위임하는 패턴


## Client 코드

- main

```java
public static void main(String[] args) {
    Store[] stores = {new OliveYoung(), new Lalavla()};
    List<Discount> discounts = getAllDiscounts(stores);
    discounts.forEach(d -> {
        System.out.println(d.toString()+" 10000원 물건에 적용시 -> "+d.applyDiscount(10000));
    });
}

public static List<Discount> getAllDiscounts(Store[] stores) {
    List<Discount> discounts = new LinkedList<>();
    for (Store store : stores) {
        for (DiscountId discountId : DiscountId.values()) {
            discounts.add(store.createDiscount(discountId));
        }
    }
    return discounts;
}
```

- 출력

```
OLIVEYOUNG 20% 할인 쿠폰 10000원 물건에 적용시 -> 8000
OLIVEYOUNG 1000 포인트 10000원 물건에 적용시 -> 9000
LALAVLA 30% 할인 쿠폰 10000원 물건에 적용시 -> 7000
LALAVLA 500 포인트 10000원 물건에 적용시 -> 9500
```
