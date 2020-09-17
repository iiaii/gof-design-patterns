### 프록시 패턴

![proxy pattern](https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Proxy_pattern_diagram.svg/1200px-Proxy_pattern_diagram.svg.png)

프록시, 말 그대로 대리인의 역할을 하는 프록시를 중간에 두고 관계를 맺는다. 간단하게 표현하면 [ 클라이언트 - 프록시 - 리얼서브젝트 ] 형태이지만 클라이언트에서는 프록시 객체인지 모르도록 인터페이스를 통해 관계를 맺기 때문에 정확히 표현하면 [ 클라이언트 - (인터페이스) - (프록시 - 리얼서브젝트) or 리얼서브젝트 ] 형태이다

- 프록시와 리얼 서브젝트가 공유하는 인터페이스가 있고 클라이언트는 해당 인터페이스 타입으로 프록시를 사용
- 클라이언트는 프록시를 거쳐서 리얼 서브젝트를 사용하기 때문에 프록시는 리얼 서브젝트에 대한 접근을 관리하거나 부가기능을 제공하거나 리턴값을 변경할 수 있음
- 부가적인 기능(접근 제한, 로깅, 트랜잭션, Lazy 로딩 등)을 제공할 때 사용함 (리얼 서브젝트는 SRP(단일책임 원칠)를 준수해야 함)

```java
// 아주 간단한 프록시 예제 (AOP)
public class Proxy implements RealSubject {
  
  RealSubject realSubject;
  
  public Proxy(RealSubject realSubject) {
      this.realSubject = realSubject;
  }
  
  @Override
  public void do() {
      System.out.println("start");
      realSubject.do();
      System.out.println("end");
  }
}
```
