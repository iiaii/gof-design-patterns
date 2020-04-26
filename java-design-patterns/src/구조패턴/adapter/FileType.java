package 구조패턴.adapter;

public enum FileType {
    MP3(".mp3"), MP4(".mp4"), MKV(".mkv");

    private final String extension;

    FileType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
