package 생성패턴.abstract_factory;

public abstract class PickledRadishes implements Eatable {
    private FoodStatus foodStatus;

    public PickledRadishes() {
        foodStatus = FoodStatus.EATABLE;
    }

    public abstract String toString();

    @Override
    public String eatingSound() {
        return "아삭!";
    }

    @Override
    public boolean isEatable() {
        return foodStatus == FoodStatus.EATABLE;
    }
}
