package pattern.builder;

abstract class VideoPlayerBuilder {
	protected VideoPlayer player = new VideoPlayer();
	public abstract void setVideoMenu();
	public abstract void setVideoPlayList();
	public abstract void setVideoMainWindow();
	public abstract void setVideoControllerBar();
	
	public boolean isShowMenu(){
		return true;
	}
	
	public boolean isShowPlayList(){
		return true;
	}
	
	public boolean isShowMainWindow(){
		return true;
	}
	
	public boolean isShowControllerBar(){
		return true;
	}
	
	public VideoPlayer createPlayer(){
		return player;
	};
}
