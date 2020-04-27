package 구조패턴.decorator;

public class Client {
    public static void main(String[] args) {
        Display display = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));

        display.draw();
    }
}
