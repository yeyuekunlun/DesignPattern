package pattern.builder;

public class FullModePlayerBuilder extends VideoPlayerBuilder{

	@Override
	public void setVideoMenu() {
		// TODO Auto-generated method stub
		player.setMenu("主菜单");
	}

	@Override
	public void setVideoPlayList() {
		// TODO Auto-generated method stub
		player.setPlayList("播放列表");
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


}
