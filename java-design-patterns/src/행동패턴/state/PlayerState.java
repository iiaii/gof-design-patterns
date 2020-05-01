package 행동패턴.state;

public interface PlayerState {
    void generalMode(Player player);
    void off(Player player);
    void lockMode(Player player);
    void volumeUp(Player player);
    void volumeDown(Player player);
}
