package 생성패턴.abstract_factory;

public class ChickenPackage {
    private Chicken chicken;
    private PickledRadishes pickledRadishes;
    private Soda soda;

    public ChickenPackage(Chicken chicken, PickledRadishes pickledRadishes, Soda soda) {
        this.chicken = chicken;
        this.pickledRadishes = pickledRadishes;
        this.soda = soda;
    }

    public Chicken getChicken() {
        return chicken;
    }

    public PickledRadishes getPickledRadishes() {
        return pickledRadishes;
    }

    public Soda getSoda() {
        return soda;
    }
}
