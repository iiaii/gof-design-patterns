# 옵저버 패턴 

- 행동 패턴
- 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만든다.
- 다른 이름 : Pub - Sub


## 예제 : 게임 실시간 점수 현황
- Subject : Subject
- Observer : Observer
- ConcreteSubject : ScoreRecord
- ConcreteObserver : TopView, AverageView, MinMaxView
- (Client : Client)


## Client 코드

- main

```java
ScoreRecord scoreRecord = new ScoreRecord();
TopView topView3 = new TopView(scoreRecord, 3);
TopView topView5 = new TopView(scoreRecord, 5);
MinMaxView minMaxView = new MinMaxView(scoreRecord);

scoreRecord.attach(topView3);
scoreRecord.attach(topView5);
scoreRecord.attach(minMaxView);

Random random = new Random();
for (int i = 0; i < 5 ; i++) {
    scoreRecord.addScore(random.nextInt(100));
}

scoreRecord.detach(topView5);
AverageView averageView = new AverageView(scoreRecord);
scoreRecord.attach(averageView);

for (int i = 0; i < 5 ; i++) {
    scoreRecord.addScore(random.nextInt(100));
}
```

- 출력

```
-------------
[ Top 3 ]
1. 77
-------------
-------------
[ Top 5 ]
1. 77
-------------
-------------
최고 점수 : 77
최저 점수 : 77
-------------
-------------
[ Top 3 ]
1. 77
2. 26
-------------
-------------
[ Top 5 ]
1. 77
2. 26
-------------
-------------
최고 점수 : 77
최저 점수 : 26
-------------
-------------
[ Top 3 ]
1. 77
2. 26
3. 14
-------------
-------------
[ Top 5 ]
1. 77
2. 26
3. 14
-------------
-------------
최고 점수 : 77
최저 점수 : 14
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 26
-------------
-------------
[ Top 5 ]
1. 79
2. 77
3. 26
4. 14
-------------
-------------
최고 점수 : 79
최저 점수 : 14
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 49
-------------
-------------
[ Top 5 ]
1. 79
2. 77
3. 49
4. 26
5. 14
-------------
-------------
최고 점수 : 79
최저 점수 : 14
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 71
-------------
-------------
최고 점수 : 79
최저 점수 : 14
-------------
-------------
평균 : 52
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 71
-------------
-------------
최고 점수 : 79
최저 점수 : 14
-------------
-------------
평균 : 49
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 71
-------------
-------------
최고 점수 : 79
최저 점수 : 14
-------------
-------------
평균 : 46
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 71
-------------
-------------
최고 점수 : 79
최저 점수 : 10
-------------
-------------
평균 : 42
-------------
-------------
[ Top 3 ]
1. 79
2. 77
3. 71
-------------
-------------
최고 점수 : 79
최저 점수 : 10
-------------
-------------
평균 : 43
-------------
```