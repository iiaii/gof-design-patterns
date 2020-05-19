# 책임 연쇄

- 행동 패턴
- 메시지를 보내는 객체와 이를 받아 처리하는 객체들 간의 결합도를 없애기 위한 패턴이다. 하나의 요청에 대한 처리가 반드시 한 객체에서만 되지 않고, 여러 객체에게 그 처리 기회를 주려는 것이다.

## 예제 : 에러 로그 
- Handler : Logger
- ConcreteHandler : StdinLogger, StdoutLogger
- Client : Client
(Error)
[책임 연쇄/사슬 패턴 :: Programming](https://programmingfbf7290.tistory.com/entry/%EC%B1%85%EC%9E%84-%EC%97%B0%EC%87%84%EC%82%AC%EC%8A%AC-%ED%8C%A8%ED%84%B4)


## Client 코드

- main

```java
Error error1 = new Error(1);
Error error2 = new Error(2);

Logger logger = new StdoutLogger(1);
logger.setNext(new StdinLogger(2));

logger.log(error1);
logger.log(error2);
logger.log(error2);
```

- 출력

```
[ Error 1 ] Error name : Stdout
[ Error 2 ] Error name : Stdin
[ Error 2 ] Error name : Stdin
```