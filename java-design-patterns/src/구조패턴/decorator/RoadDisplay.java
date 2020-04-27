package 구조패턴.decorator;

public class RoadDisplay extends Display {
    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}
