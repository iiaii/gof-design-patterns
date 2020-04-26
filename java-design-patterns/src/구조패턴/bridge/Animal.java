package 구조패턴.bridge;

public abstract class Animal {
    private Huntable huntable;

    public Animal(Huntable huntable) {
        this.huntable = huntable;
    }

    public void hunt() {
        huntable.lookingForPrey();
        huntable.attack();
    }
}
