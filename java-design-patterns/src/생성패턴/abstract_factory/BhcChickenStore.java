package 생성패턴.abstract_factory;

public class BhcChickenStore extends ChickenStore {
    @Override
    public Chicken getChicken() {
        Chicken chicken = new BhcChicken();
        this.fryChicken(chicken);
        return chicken;
    }

    @Override
    public PickledRadishes getPickledRadishes() {
        return new BhcPickledRadishes();
    }

    @Override
    public Soda getSoda() {
        return new Pepsi();
    }
}
