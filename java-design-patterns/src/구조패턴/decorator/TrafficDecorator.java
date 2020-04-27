package 구조패턴.decorator;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" + 교통량표시");
    }
}
