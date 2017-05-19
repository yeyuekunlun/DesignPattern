package pattern.factory;

public class PngReaderFactory extends ReaderFactory{

	@Override
	public PictureReader CreateReader() {
		// TODO Auto-generated method stub
		//一些初始化工作
		PictureReader reader = new PngReader();
		return reader;
	}

}
