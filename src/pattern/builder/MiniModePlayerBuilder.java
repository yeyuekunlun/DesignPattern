package pattern.builder;

public class MiniModePlayerBuilder extends VideoPlayerBuilder{

	@Override
	public void setVideoMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVideoPlayList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVideoMainWindow() {
		// TODO Auto-generated method stub
		player.setMainWindow("主窗口");
	}

	@Override
	public void setVideoControllerBar() {
		// TODO Auto-generated method stub
		player.setControllerBar("控制条");
	}
	
	@Override
	public boolean isShowMenu() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isShowPlayList() {
		// TODO Auto-generated method stub
		return false;
	}


}
