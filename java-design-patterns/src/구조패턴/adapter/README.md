# 어댑터 패턴

- 구조 패턴
- 예제 : 영상과 댓글이 동시에 재생되는 유튜브 영상 

## 종류
- Target : Video
- Client : Client
- Adaptee : Comments
- Adapter : VideoWithCommentsClassAdapter, VideoWithCommentsObjectAdapter
- (ConcreteAdaptee : YoutubeCommentsPlayer) 
- (ConcreteTarget : Mp4)