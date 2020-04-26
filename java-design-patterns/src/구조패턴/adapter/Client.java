package 구조패턴.adapter;

public class Client {
    public static void main(String[] args) {
        Video mp4 = new Mp4();
        mp4.play("test.mp4");

        Video youtubeVideo = new VideoWithCommentsObjectAdapter(new YoutubeCommentsPlayer());
        youtubeVideo.play("유트브 영상");

        VideoWithCommentsClassAdapter newYoutubeVideo = new VideoWithCommentsClassAdapter();
        newYoutubeVideo.playVideoWithComments("유트브 영상2");
    }
}
