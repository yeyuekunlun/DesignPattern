package pattern.factory;

public class GifReaderFactory extends ReaderFactory{

	@Override
	public PictureReader CreateReader() {
		// TODO Auto-generated method stub
		PictureReader reader = new GifReader();
		return reader;
	}

}
