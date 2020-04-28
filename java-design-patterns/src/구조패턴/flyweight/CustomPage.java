package 구조패턴.flyweight;

public class CustomPage implements Page {
    private String id;

    public CustomPage(String id) {
        System.out.println(id+" >> 전용페이지 생성중");
        this.id = id;
    }

    @Override
    public void showPage() {
        System.out.println(id+"님 전용 페이지");
    }
}
