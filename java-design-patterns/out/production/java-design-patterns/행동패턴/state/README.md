# 상태 패턴

- 행동 패턴
- 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로 이렇게 하면 객체는 마치 자신의 클래스를 바꾸는 것 처럼 보인다.


## 예제 : 음악 플레이어
- Context : Player
- State : PlayerState
- ConcreteState : Off, General, Lock
- (Client : Client)
- (Volume)


## Client 코드

- main

```java
Player player = new Player();

player.off();
player.generalMode();
player.volumeDown();
player.volumeDown();
player.volumeDown();
player.volumeDown();
player.lockMode();
player.off();
player.generalMode();
player.volumeUp();
```

- 출력

```
[ 이미 플레이어가 꺼져 있습니다 ]
[ 플레이어를 켭니다 ]
[ 볼륨 : 3 >> 2 ]
[ 볼륨 : 2 >> 1 ]
[ 볼륨 : 1 >> 0 ]
[ 이미 최저 음량(음소거)입니다 ]
[ 잠금 모드로 전환합니다 ]
[ 현재 잠금 모드입니다 ]
[ 기본 모드로 전환합니다 ]
[ 볼륨 : 0 >> 1 ]
```