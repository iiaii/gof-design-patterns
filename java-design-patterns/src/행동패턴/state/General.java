package 행동패턴.state;

public enum General implements PlayerState {
    STATE;

    @Override
    public void generalMode(Player player) {
        System.out.println("[ 이미 플레이어가 켜져 있습니다 ]");
    }

    @Override
    public void off(Player player) {
        player.setPlayerState(Off.STATE);
        System.out.println("[ 플레이어를 종료합니다 ]");
    }

    @Override
    public void lockMode(Player player) {
        player.setPlayerState(Lock.STATE);
        System.out.println("[ 잠금 모드로 전환합니다 ]");
    }

    @Override
    public void volumeUp(Player player) {
        if(player.getVolume() == Volume.MAX) {
            System.out.println("[ 이미 최대 음량입니다 ]");
            return;
        }
        Volume nextVolume = Volume.getVolume(player.getVolume().getValue()+1);
        printVolume(player.getVolume(), nextVolume);
        player.setVolume(nextVolume);
    }

    @Override
    public void volumeDown(Player player) {
        if(player.getVolume() == Volume.MUTE) {
            System.out.println("[ 이미 최저 음량(음소거)입니다 ]");
            return;
        }
        Volume nextVolume = Volume.getVolume(player.getVolume().getValue()-1);
        printVolume(player.getVolume(), nextVolume);
        player.setVolume(nextVolume);
    }

    private void printVolume(Volume playerVolume, Volume nextVolume) {
        System.out.println("[ 볼륨 : " + playerVolume.getValue()+ " >> " + nextVolume.getValue() + " ]");
    }
}
