package 구조패턴.decorator;

public abstract class DisplayDecorator extends Display {
    private Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }

    @Override
    public void draw() {
        display.draw();
    }
}
