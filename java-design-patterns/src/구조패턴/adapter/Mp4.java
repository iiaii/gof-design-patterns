package 구조패턴.adapter;

public class Mp4 extends Video {
    @Override
    public void play(String videoName) {
        System.out.println("Playing MP4 >> "+videoName);
    }
}
