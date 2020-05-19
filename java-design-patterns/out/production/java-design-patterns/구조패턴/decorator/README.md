# 데코레이터 패턴

- 구조 패턴
- 객체에 동적으로 새로운 책임을 추가할 수 있게 한다. 기능을 추가하려면, 서브클래스를 생성하는 것보다 융통성 있는 방법을 제공한다.
- 다른 이름 : 래퍼 클래스 


## 예제 : 네비게이션 차선, 정보 표시
- Component : Display
- ConcreteComponent : RoadDisplay
- Decorator : DisplayDecorator
- ConcreteDecorator : LaneDecorator, TrafficDecorator
- Client : Client


## Client 코드

- main

```java
Display display = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));

display.draw();
```

- 출력

```
기본 도로 표시
 + 교통량표시
 + 차선표시
```