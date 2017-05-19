package pattern.builder;
//Sunny软件公司欲开发一个视频播放软件，为了给用户使用提供方便，该播放软件提供多
//种界面显示模式，如完整模式、精简模式、记忆模式、网络模式等。在不同的显示模式
//下主界面的组成元素有所差异，如在完整模式下将显示菜单、播放列表、主窗口、控制
//条等，在精简模式下只显示主窗口和控制条，而在记忆模式下将显示主窗口、控制条、
//收藏列表等。尝试使用建造者模式设计该软件。
public class VideoPlayer {
	private String menu;
	private String playList;
	private String mainWindow;
	private String controllerBar;
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPlayList() {
		return playList;
	}
	public void setPlayList(String playList) {
		this.playList = playList;
	}
	public String getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(String mainWindow) {
		this.mainWindow = mainWindow;
	}
	public String getControllerBar() {
		return controllerBar;
	}
	public void setControllerBar(String controllerBar) {
		this.controllerBar = controllerBar;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "播放器构件如下:"+mainWindow+":"+menu+":"+playList+":"+controllerBar;
	}
}
