package pattern.abstractFactory;

import java.io.IOException;
import java.util.Properties;

public class Client{
	public static void main(String[] args) throws  InstantiationException, IllegalAccessException {
		Properties pro = new Properties();
		try {
			pro.load(Client.class.getResourceAsStream("config.properties"));
			String curF = pro.getProperty("CurrentDevice");
			Class<?> clazz = Class.forName(curF);
			GameOIFactory factory = (GameOIFactory) clazz.newInstance();
			OperationController operationFactory = factory.operationFactory();
			InterfaceController displayFactory = factory.displayFactory();
			operationFactory.operation();
			displayFactory.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到配置文件");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("无法识别设备信息");
			e.printStackTrace();
		}
	}
}
