# 추상 팩토리 패턴

- 생성 패턴 
- 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공한다. (관련성 있는 여러 종류의 객체를 일관성 있게 생성할 때 유용함)


## 예제 : 치킨 배달
- AbstractFactory : ChickenStore
- ConcreteFactory : BbqChickenStore, BhcChickenStore
- AbstractProduct : Chicken, PickledRadishes, Soda
- ConcreteProduct : BbqChicken, BhcChicken, BbqPickledRadishes, BhcPickledRadishes, CocaCola, Pepsi
- Client : Client
- (AbstractFactoryFactory :  ChickenDeliveryApp)


## Client 코드

- main

```java
public static void main(String[] args) {
    ChickenPackage bhcChickenPackage = ChickenDeliveryApp.orderChickenPackage(VendorId.BHC);
    eat(bhcChickenPackage.getChicken());
    eat(bhcChickenPackage.getPickledRadishes());
    eat(bhcChickenPackage.getSoda());

    ChickenPackage bbqChickenPackage = ChickenDeliveryApp.orderChickenPackage(VendorId.BBQ);
    eat(bbqChickenPackage.getChicken());
    eat(bbqChickenPackage.getPickledRadishes());
    eat(bbqChickenPackage.getSoda());
}

public static void eat(Eatable eatable) {
    if(eatable.isEatable()) {
        System.out.println(eatable.toString()+" 을(를) 먹습니다");
        System.out.println("(소리) "+eatable.eatingSound());
    } else {
        System.out.println(eatable.toString()+" 은(는) 현재 먹을 수 없는 상태입니다");
    }
    System.out.println("-----------------------");
}
```

- 출력

```
BHC 치킨 조리 완료!
BHC 치킨 배달 완료!
-----------------------
BHC 치킨 을(를) 먹습니다
(소리) 바삭!
-----------------------
BHC 치킨무 을(를) 먹습니다
(소리) 아삭!
-----------------------
펩시 을(를) 먹습니다
(소리) 치이익!
-----------------------
BBQ 치킨 조리 완료!
BBQ 치킨 배달 완료!
-----------------------
BBQ 치킨 을(를) 먹습니다
(소리) 바삭!
-----------------------
BBQ 치킨무 을(를) 먹습니다
(소리) 아삭!
-----------------------
코카콜라 을(를) 먹습니다
(소리) 치이익!
-----------------------
```