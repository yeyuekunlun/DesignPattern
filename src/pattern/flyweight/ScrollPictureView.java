package pattern.flyweight;

public class ScrollPictureView implements PictureView{
	
	private String playMode="�ֲ���ʽ";
	
	
	@Override
	public void display(Picture picture) {
		// TODO Auto-generated method stub
		System.out.println("ͼƬ��"+picture.getName()+" ����ͼƬ��ʽ:"+playMode);
	}



}
