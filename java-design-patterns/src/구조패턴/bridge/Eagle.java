package 구조패턴.bridge;

public class Eagle extends Animal {
    public Eagle(Huntable huntable) {
        super(huntable);
    }

    @Override
    public void hunt() {
        System.out.println("독수리의 사냥 >> ");
        super.hunt();
    }
}
