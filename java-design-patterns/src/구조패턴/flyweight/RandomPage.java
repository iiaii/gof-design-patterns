package 구조패턴.flyweight;

public class RandomPage implements Page {
    private int random;

    public RandomPage(int random) {
        System.out.println(random+" >> 랜덤페이지 생성중");
        this.random = random;
    }

    @Override
    public void showPage() {
        System.out.println(random+" 랜덤 페이지");
    }
}
