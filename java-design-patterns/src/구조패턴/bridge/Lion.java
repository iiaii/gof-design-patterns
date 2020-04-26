package 구조패턴.bridge;

public class Lion extends Animal {
    public Lion(Huntable huntable) {
        super(huntable);
    }

    @Override
    public void hunt() {
        System.out.println("사자의 사냥 >> ");
        super.hunt();
    }
}
