package pattern.simplefactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Client {
	static String configFile = "/pattern/simplefactory/config.properties";
	static String configFile2 = "config.properties";
	static String configFile3 = "pattern/simplefactory/config.properties";
	static String useConfig = "UseShape";
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
//		FileInputStream fis = new FileInputStream(configFile);
//		DumperUtil.class.getClassLoader().getResourceAsStream(conf)
//		InputStream fis = Client.class.getResourceAsStream(configFile);
		InputStream fis = Client.class.getResourceAsStream(configFile2);
//		InputStream fis = Client.class.getClassLoader().getResourceAsStream(configFile3);
		properties.load(fis);
		String value = (String) properties.get(useConfig);
		System.out.println(value);
		Shape shape = ShapeFactory.getShape(value);
		shape.draw();
		shape.erase();
		
	}
}
