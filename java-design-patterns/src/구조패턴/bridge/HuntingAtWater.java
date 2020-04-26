package 구조패턴.bridge;

public enum HuntingAtWater implements Huntable {
    METHOD;

    public static Huntable getMethod() {
        return METHOD;
    }

    @Override
    public void lookingForPrey() {
        System.out.println("물에서 먹이를 찾습니다.");
    }

    @Override
    public void attack() {
        System.out.println("낚아챕니다.");
    }
}
