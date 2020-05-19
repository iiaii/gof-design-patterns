# 템플릿 메서드 

- 행동 패턴
- 객체의 연산에는 알고리즘의 뼈대만을 정의하고 각 단계에서 수행할 구체적 처리는 서브클래스 쪽으로 미룬다. 알고리즘의 구조 자체는 그대로 놔둔 채 알고리즘 각 단계 처리를 서브클래스에서 재정의할 수 있게 한다.
- 템플릿 메서드 패턴의 전체적인 알고리즘은 상위 클래스에서 구현하면서 다른 부분은 하위 클래스에서 구현할 수 있도록 하는 디자인 패턴. (전체적인 알고리즘 코드를 재사용하는데 유용) -> 추상클래스 (일치하는 부분은 구현(템플릿 메서드), 하위클래스로 오버라이드가 필요한 부분은 protected abstract 메서드로 넘김(primitive 혹은 hook 메서드))
  [자바 객체지향 디자인 패턴 - 책]


## 예제 : 자동차 예제
- AbstractClass : Car
- ConcreteClass : Tesla, Bmw
- (Door : Door)
- (Client : Client)


## Client 코드

- main

```java
Car tesla  =  new Tesla(new Door());
Car bmw  =  new Bmw(new Door());

tesla.openDoor();
tesla.move(Direction.FORWARD);
tesla.openDoor();
tesla.stop();

bmw.openDoor();
bmw.move(Direction.BACKWARD);
bmw.move(Direction.FORWARD);
bmw.stop();
```

- 출력

```
TESLA : 문을 엽니다
TESLA : 문을 닫습니다
TESLA : 테슬라 전용 모터를 FORWARD 방향으로 구동합니다
TESLA : FORWARD 방향으로 이동합니다
TESLA : 이동중에는 문을 열 수 없습니다
TESLA : 정지 합니다
BMW : 문을 엽니다
BMW : 문을 닫습니다
BMW : BMW 전용 모터를 BACKWARD 방향으로 구동합니다
BMW : BACKWARD 방향으로 이동합니다
BMW : BMW 전용 모터를 FORWARD 방향으로 구동합니다
BMW : FORWARD 방향으로 이동합니다
BMW : 정지 합니다
```