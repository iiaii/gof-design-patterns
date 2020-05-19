# 퍼사드 패턴

- 구조 패턴
- 한 서브시스템 내의 인터페이스 집합에 대한 획일화된 하나의 인터페이스를 제공하는 패턴으로, 서브시스템을 사용하기 쉽도록 상위 수준의 인터페이스를 정의한다. (예제의 경우 TV가 모니터, 스피커 등의 부품을 포함하고 사용법을 제공함)


## 예제 : TV, 리모컨
- Facade : Tv
- SubSystem : RemoteReceiver, Monitor
- Client : Client


## Client 코드

- main

```java
Tv tv = new Tv();

tv.controlTv(Signal.ON);
System.out.println("---------");
tv.controlTv(Signal.OFF);
```

- 출력

```
On 신호수신
모니터를 켭니다
---------
Off 신호수신
모니터를 끕니다
```