package 구조패턴.adapter;

public class YoutubeCommentsPlayer implements Comments {
    @Override
    public void playComments(String commentsName) {
        System.out.println("Playing Comments >> "+commentsName);
    }
}
