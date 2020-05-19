# 컴포지트 패턴

- 구조 패턴
- 부분과 전체의 계층을 표현하기 위해 객체들을 모아 트리 구조로 구성한다. 사용자로 하여금 개별 객체와 복합 객체를 모두 동일하게 다룰 수 있도록 하는 패턴이다. (컴포지트는 컴포넌트 리스트를 가짐)


## 예제 : 컴퓨터 구성품
- Component : ComputerDevice
- Leaf : KeyBoard, Mouse, Monitor, Body
- Composite : Computer
- Client : Client


## Client 코드 

- main

```java
Computer myComputer = new Computer();

myComputer.addDevice(new Mouse(30000,50));
myComputer.addDevice(new KeyBoard(50000,50));
myComputer.addDevice(new Monitor(150000,170));
myComputer.addDevice(new Body(1500000,300));

System.out.println("컴퓨터 비용 : "+myComputer.getPrice()+"원");
System.out.println("컴퓨터 소비전력 : "+myComputer.getPower()+"W");
```

- 출력 

```
컴퓨터 비용 : 1730000원
컴퓨터 소비전력 : 570W
```