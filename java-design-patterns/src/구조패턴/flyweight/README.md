# 플라이웨이트 패턴

- 구조 패턴
- 공유를 통해 많은 수의 소립 객체들을 효과적으로 지원한다. (gof 예제는 글에서 반복되는 알파벳)


## 예제 : 웹 페이지 (커스텀/랜덤)
- Flyweight : Page
- ConcreteFlyweight : CustomPage
- UnsharedConcreteFlyweight : RandomPage
- FlyweightFactory : PageFactory
- Client : Client


## Client 코드

- main

```java
public static void main(String[] args) {
    PageFactory pageFactory = PageFactory.FACTORY;

    pages.add(pageFactory.getCustomPage("iiaii"));
    pages.add(pageFactory.getCustomPage("iiaii"));
    pages.add(pageFactory.getRandomPage());
    pages.add(pageFactory.getRandomPage());
    pages.add(pageFactory.getRandomPage());
    System.out.println("------------------");
    showPages();
}

public static void showPages() {
    pages.forEach(Page::showPage);
}
```

- 출력

```
iiaii >> 전용페이지 생성중
7 >> 랜덤페이지 생성중
4 >> 랜덤페이지 생성중
1 >> 랜덤페이지 생성중
------------------
iiaii님 전용 페이지
iiaii님 전용 페이지
7 랜덤 페이지
4 랜덤 페이지
1 랜덤 페이지
```