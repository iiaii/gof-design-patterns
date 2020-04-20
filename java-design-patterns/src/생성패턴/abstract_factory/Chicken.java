package 생성패턴.abstract_factory;

public abstract class Chicken implements Eatable {
    private FoodStatus foodStatus;

    public Chicken() {
        foodStatus = FoodStatus.UNEATABLE;
    }

    public abstract String toString();
    public void fry() {
        foodStatus = FoodStatus.EATABLE;
    }

    @Override
    public String eatingSound() {
        return "바삭!";
    }

    @Override
    public boolean isEatable() {
        return foodStatus == FoodStatus.EATABLE;
    }
}
