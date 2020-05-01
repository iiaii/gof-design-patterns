package 행동패턴.state;

public enum Off implements PlayerState {
    STATE;

    @Override
    public void generalMode(Player player) {
        player.setPlayerState(General.STATE);
        player.setVolume(Volume.THREE);
        System.out.println("[ 플레이어를 켭니다 ]");
    }

    @Override
    public void off(Player player) {
        System.out.println("[ 이미 플레이어가 꺼져 있습니다 ]");
    }

    @Override
    public void lockMode(Player player) {
        System.out.println("[ 플레이어가 꺼져 있습니다 ]");
    }

    @Override
    public void volumeUp(Player player) {
        System.out.println("[ 플레이어가 꺼져 있습니다 ]");
    }

    @Override
    public void volumeDown(Player player) {
        System.out.println("[ 플레이어가 꺼져 있습니다 ]");
    }
}
