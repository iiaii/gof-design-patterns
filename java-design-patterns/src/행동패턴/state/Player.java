package 행동패턴.state;

public class Player {
    private PlayerState playerState;
    private Volume volume;

    public Player() {
        playerState = Off.STATE;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public Volume getVolume() {
        return volume;
    }

    public void off() {
        playerState.off(this);
    }

    public void generalMode() {
        playerState.generalMode(this);
    }

    public void lockMode() {
        playerState.lockMode(this);
    }


    public void volumeUp() {
        playerState.volumeUp(this);
    }

    public void volumeDown() {
        playerState.volumeDown(this);
    }
}
