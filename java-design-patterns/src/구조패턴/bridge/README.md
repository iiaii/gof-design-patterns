# 브릿지 패턴

- 구조 패턴
- 구현에서 추상을 분리하여, 이들이 독립적으로 다양성을 가질 수 있도록 한다.
- 다른 이름 : 핸들 / 구현부 


## 예제 : 동물 사냥
- Abstraction : Animal
- RefinedAbstraction : Lion, Eagle
- Implementor : Huntable
- ConcreteImplementor : HuntingAtGround, HuntingAtWater (enum 싱글톤 적용)
- (Client : Client)


## Client 코드

- main

```java
Animal lion = new Lion(HuntingAtGround.METHOD);
Animal eagle = new Eagle(HuntingAtWater.METHOD);

lion.hunt();
System.out.println();
eagle.hunt();
``` 

- 출력

```
사자의 사냥 >> 
지상에서 동물을 찾습니다.
물어뜯습니다.

독수리의 사냥 >> 
물에서 먹이를 찾습니다.
낚아챕니다.
```