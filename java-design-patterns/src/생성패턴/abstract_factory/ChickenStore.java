package 생성패턴.abstract_factory;

public abstract class ChickenStore {
    public ChickenPackage getChickenPackage() {
        return new ChickenPackage(getChicken(), getPickledRadishes(), getSoda());
    }
    public abstract Chicken getChicken();
    public abstract PickledRadishes getPickledRadishes() ;
    public abstract Soda getSoda();
    public void fryChicken(Chicken chicken) {
        chicken.fry();
        System.out.println(chicken.toString()+" 조리 완료!");
    }
}
