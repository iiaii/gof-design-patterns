package 구조패턴.adapter;

public class VideoWithCommentsClassAdapter extends Video implements Comments {
    @Override
    public void playComments(String commentsName) {
        System.out.println("Playing Comments >> "+commentsName);
    }

    @Override
    public void play(String videoName) {
        System.out.println("Playing Video >> "+videoName);
    }

    public void playVideoWithComments(String videoName) {
        System.out.println("-------------");
        play(videoName);
        playComments(videoName);
        System.out.println("-------------");
    }
}
