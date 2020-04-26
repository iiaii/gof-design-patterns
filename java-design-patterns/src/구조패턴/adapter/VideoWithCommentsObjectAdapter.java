package 구조패턴.adapter;

public class VideoWithCommentsObjectAdapter extends Video {
    private Comments comments;

    public VideoWithCommentsObjectAdapter(Comments comments) {
        this.comments = comments;
    }

    @Override
    public void play(String videoName) {
        System.out.print("Playing Video >> ");
        comments.playComments(videoName);
    }
}
