package 생성패턴.abstract_factory;

public abstract class Soda implements Eatable {
    private FoodStatus foodStatus;

    public Soda() {
        foodStatus = FoodStatus.EATABLE;
    }

    public abstract String toString();

    @Override
    public String eatingSound() {
        return "치이익!";
    }

    @Override
    public boolean isEatable() {
        return foodStatus == FoodStatus.EATABLE;
    }
}
