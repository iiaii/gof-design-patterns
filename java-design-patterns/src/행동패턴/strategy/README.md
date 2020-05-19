# 전략 패턴

- 행동 패턴
- 동일 계열의 알고리즘군을 정의하고, 각 알고리즘을 캡슐화하며, 이들을 상호교환이 가능하도록 만든다. 알고리즘을 사용하는 클라이언트와 상관없이 독립적으로 알고리즘을 다양하게 변경할 수 있게 한다.


## 예제 : 로봇
- Strategy : MovingStrategy, AttackStrategy
- ConcreteStrategy : WalkingStrategy, FlyingStrategy, PunchStrategy, MissileStrategy
- Context : Robot
- (ConcreteContext : Atom, TaekwonV)
- (Client : Client)


## Client 코드

- main

```java
Robot taekwonV = new TaekwonV("태권브이", Walking.STRATEGY, Punch.STRATEGY);
Robot atom = new Atom("아톰", Flying.STRATEGY, Missile.STRATEGY);

taekwonV.attack();
taekwonV.move();
atom.attack();
atom.move();
```

- 출력

```
태권브이 : 펀치 공격
태권브이 : 걸어다닙니다
아톰 : 미사일 공격
아톰 : 날아다닙니다
```