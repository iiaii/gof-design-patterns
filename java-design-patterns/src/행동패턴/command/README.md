# 커맨드 패턴 

- 행동 패턴
- 요청 자체를 캡슐화하는 것이다. 이를 통해 요청이 서로 다른 사용자를 매개변수로 만들고, 요청을 대기시키거나 로깅하며, 되돌릴 수 있는 연산을 지원한다.


## 예제 : 구글 홈 기기 제어
- Command : Command
- ConcreteComand : HeaterOnCommand, HeaterOffCommand, LightOnCommand, LightOffCommand
- Invoker : OkGoogle
- Receiver : Heater, Light
- Client : Client
- (상태(State) 패턴 :  State, On, Off)
(자바 객체지향 디자인 패턴의 예제는 Button이 Command 필드를 가지고 있음)


## Client 코드

- main

```java
Heater livingRoomHeater = new Heater("거실");
Light livingRoomLight1 = new Light("거실1");
Light livingRoomLight2 = new Light("거실2");
OkGoogle okGoogle = new OkGoogle();

okGoogle.activate(HeaterOffCommand.getCommand(livingRoomHeater));
okGoogle.activate(HeaterOnCommand.getCommand(livingRoomHeater));
okGoogle.activate(HeaterOffCommand.getCommand(livingRoomHeater));
System.out.println("---------------------");
okGoogle.activate(LightOffCommand.getCommand(livingRoomLight1));
okGoogle.activate(LightOnCommand.getCommand(livingRoomLight1));
okGoogle.activate(LightOnCommand.getCommand(livingRoomLight1));
okGoogle.activate(LightOffCommand.getCommand(livingRoomLight1));
System.out.println("---------------------");
okGoogle.activate(LightOnCommand.getCommand(livingRoomLight2));
okGoogle.activate(LightOffCommand.getCommand(livingRoomLight2));
```

- 출력

```
히터 [거실] : 이미 꺼져 있습니다
히터 [거실] : ON
히터 [거실] : OFF
---------------------
전등 [거실1] : 이미 꺼져 있습니다
전등 [거실1] : ON
전등 [거실1] : 이미 켜져 있습니다
전등 [거실1] : OFF
---------------------
전등 [거실2] : ON
전등 [거실2] : OFF
```