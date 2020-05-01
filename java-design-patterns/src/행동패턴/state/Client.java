package 행동패턴.state;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();

        player.off();
        player.generalMode();
        player.volumeDown();
        player.volumeDown();
        player.volumeDown();
        player.volumeDown();
        player.lockMode();
        player.off();
        player.generalMode();
        player.volumeUp();
    }
}
