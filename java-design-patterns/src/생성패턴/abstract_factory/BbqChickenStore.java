package 생성패턴.abstract_factory;

public class BbqChickenStore extends ChickenStore {
    @Override
    public Chicken getChicken() {
        Chicken chicken = new BbqChicken();
        this.fryChicken(chicken);
        return chicken;
    }

    @Override
    public PickledRadishes getPickledRadishes() {
        return new BbqPickledRadishes();
    }

    @Override
    public Soda getSoda() {
        return new CocaCola();
    }
}
