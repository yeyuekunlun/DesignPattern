package pattern.flyweight;

public class WaterfallPictureView implements PictureView{
	private String playMode="�ٲ���չʾͼƬ";

	@Override
	public void display(Picture picture) {
		// TODO Auto-generated method stub
		System.out.println("����ͼƬ:"+picture.getName()+" ���ŷ�ʽ:"+this.playMode);
	}

}
