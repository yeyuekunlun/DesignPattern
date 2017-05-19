package pattern.flyweight;

public class WaterfallPictureView implements PictureView{
	private String playMode="瀑布流展示图片";

	@Override
	public void display(Picture picture) {
		// TODO Auto-generated method stub
		System.out.println("播放图片:"+picture.getName()+" 播放方式:"+this.playMode);
	}

}
