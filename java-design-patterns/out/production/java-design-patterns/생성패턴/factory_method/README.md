# 팩토리 메서드 패턴

- 생성 패턴
- 예제 : 할인 쿠폰, 포인트 예제  

## 종류 

1. GoF : 객체 생성 인터페이스는 미리 정의하고 어떤 인스턴스를 만들지에 대한 결정은 서브클래스에서 내리는 패턴
- Product : Discount
- ConcreteProduct : Coupon, Point
- Creator : Store
- ConcreteCreator : OliveYoung, Lalavla
- (Client : Client)

2. Effective Java : 생성자로 객체를 생성할 때 발생하는 단점을 보완하여 클래스의 static 메서드로 객체 생성을 위임하는 패턴

