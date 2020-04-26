# 브릿지 패턴

- 구조 패턴
- 예제 : 동물 사냥

## 종류
- Abstraction : Animal
- RefinedAbstraction : Lion, Eagle
- Implementor : Huntable
- ConcreteImplementor : HuntingAtGround, HuntingAtWater (enum 싱글톤 적용)
- (Client : Client) 