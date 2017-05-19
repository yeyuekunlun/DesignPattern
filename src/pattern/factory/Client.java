package pattern.factory;

import java.io.IOException;
import java.util.Properties;

public class Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties prop = new Properties();
		prop.load(Client.class.getResourceAsStream("config.properties"));
		String config = (String) prop.get("UseReader");
		Class<?> clazz = Class.forName(config);
		ReaderFactory factory = (ReaderFactory) clazz.newInstance();
		PictureReader reader = factory.CreateReader();
		reader.ReadPicture();
		
	}
}
