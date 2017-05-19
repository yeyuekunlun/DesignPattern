package pattern.flyweight;

public class Client {
	public static void main(String[] args) {
		PictureViewFactory fc = PictureViewFactory.getFacture();
		PictureView instance = fc.getInstance("scroll");
		Picture pic = new Picture();
		pic.setName("èó¸ß ÔÂÁÁ");
		instance.display(pic);
	}
}
