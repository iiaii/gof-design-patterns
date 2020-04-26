package 구조패턴.bridge;

public enum HuntingAtGround implements Huntable {
    METHOD;

    public static Huntable getMethod() {
        return METHOD;
    }

    @Override
    public void lookingForPrey() {
        System.out.println("지상에서 동물을 찾습니다.");
    }

    @Override
    public void attack() {
        System.out.println("물어뜯습니다.");
    }
}
