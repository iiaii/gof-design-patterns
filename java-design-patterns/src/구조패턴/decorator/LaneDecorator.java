package 구조패턴.decorator;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" + 차선표시");
    }
}
