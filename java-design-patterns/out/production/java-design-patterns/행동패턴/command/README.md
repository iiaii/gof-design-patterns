# 커맨드 패턴 

- 행동 패턴
- 예제 : 구글 홈 기기 제어
- (자바 객체지향 디자인 패턴의 예제는 Button이 Command 필드를 가지고 있음)

## 종류
- Command : Command
- ConcreteComand : HeaterOnCommand, HeaterOffCommand, LightOnCommand, LightOffCommand
- Invoker : OkGoogle
- Receiver : Heater, Light
- Client : Client
- (Device / DeviceStatus)