package pattern.flyweight;

public class ScrollPictureView implements PictureView{
	
	private String playMode="轮播方式";
	
	
	@Override
	public void display(Picture picture) {
		// TODO Auto-generated method stub
		System.out.println("图片："+picture.getName()+" 播放图片方式:"+playMode);
	}



}
