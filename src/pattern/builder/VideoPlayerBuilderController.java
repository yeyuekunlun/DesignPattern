package pattern.builder;

public class VideoPlayerBuilderController {
	public VideoPlayer createPlayerByType(VideoPlayerBuilder builder){
		if(builder.isShowControllerBar()){
			builder.setVideoControllerBar();
		}
		if(builder.isShowMainWindow()){
			builder.setVideoMainWindow();
		}
		if(builder.isShowMenu()){
			builder.setVideoMenu();
		}
		if(builder.isShowPlayList()){
			builder.setVideoPlayList();
		}
		return builder.createPlayer();
	}
}
