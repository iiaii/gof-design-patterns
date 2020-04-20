# 추상 팩토리 패턴

- 생성 패턴 
- 예제 : 치킨 배달 예제

## 참여자
- AbstractFactory : ChickenStore
- ConcreteFactory : BbqChickenStore, BhcChickenStore
- AbstractProduct : Chicken, PickledRadishes, Soda
- ConcreteProduct : BbqChicken, BhcChicken, BbqPickledRadishes, BhcPickledRadishes, CocaCola, Pepsi
- Client : Client
- (AbstractFactoryFactory :  ChickenDeliveryApp)