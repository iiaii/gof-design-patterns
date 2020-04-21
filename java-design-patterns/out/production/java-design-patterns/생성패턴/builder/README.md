# 빌더 패턴

- 생성 패턴
- 예제 : 피자 가게 주문 

## 종류 

1. GoF : 생성과 표현하는 방법을 정의하는 클래스를 분리하여 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절 차를 제공 할 때
- Builder : PizzaMaker (피자 만드는 직원)
- ConcreteBuilder : NewYorkPizzaMaker, ChicagoPizzaMaker
- Director : PizzaStoreOwner (피자집 사장)
- Prodcut : NewYorkPizza, ChicagoPizza
- (AbstractProduct : Pizza (피자))
- (Client : Client) 

2. Effective Java : 객체의 필수 요소(필드)가 많을 때 불변을 보장하면서 깔끔하고 유연하게 객체를 생성할 때
 