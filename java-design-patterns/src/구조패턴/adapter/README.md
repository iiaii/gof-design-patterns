# 어댑터 패턴

- 구조 패턴
- 클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 적응시킨다. 서로 일치하지 않는(서로 관계가 없는) 인터페이스를 갖는 클래스들을 함께 동작 시킨다.
- 다른 이름 : 래퍼클래스 


## 예제 : 영상과 댓글이 동시에 재생되는 유튜브 영상
- Target : Video
- Client : Client
- Adaptee : Comments
- Adapter : VideoWithCommentsClassAdapter (abstract+interface), VideoWithCommentsObjectAdapter (abstract, 포함관계)
- (ConcreteAdaptee : YoutubeCommentsPlayer) 
- (ConcreteTarget : Mp4)


## Client 코드 

- main

```java
Video mp4 = new Mp4();
mp4.play(“test.mp4”);

Video youtubeVideo = new VideoWithCommentsObjectAdapter(new YoutubeCommentsPlayer());
youtubeVideo.play("유트브 영상");

VideoWithCommentsClassAdapter newYoutubeVideo = new VideoWithCommentsClassAdapter();
newYoutubeVideo.playVideoWithComments(“유트브 영상2”);
```

- 출력 

```
Playing MP4 >> test.mp4
Playing Video >> Playing Comments >> 유트브 영상
-------------
Playing Video >> 유트브 영상2
Playing Comments >> 유트브 영상2
-------------
```