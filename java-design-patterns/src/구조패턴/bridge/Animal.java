package 구조패턴.bridge;

public class Animal {
    private Huntable huntable;

    public Animal(Huntable huntable) {
        this.huntable = huntable;
    }

    public void hunt() {
        huntable.lookingForPrey();
        huntable.attack();
    }
}
