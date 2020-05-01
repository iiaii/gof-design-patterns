package 행동패턴.state;

public enum Lock implements PlayerState {
    STATE;

    @Override
    public void generalMode(Player player) {
        player.setPlayerState(General.STATE);
        System.out.println("[ 기본 모드로 전환합니다 ]");
    }

    @Override
    public void off(Player player) {
        System.out.println("[ 현재 잠금 모드입니다 ]");
    }

    @Override
    public void lockMode(Player player) {
        System.out.println("[ 현재 잠금 모드입니다 ]");
    }

    @Override
    public void volumeUp(Player player) {
        System.out.println("[ 현재 잠금 모드입니다 ]");
    }

    @Override
    public void volumeDown(Player player) {
        System.out.println("[ 현재 잠금 모드입니다 ]");
    }
}
