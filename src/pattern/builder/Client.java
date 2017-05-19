package pattern.builder;

import java.io.InputStream;
import java.util.Properties;

public class Client {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		InputStream in = Client.class.getResourceAsStream("/pattern/pattern.properties");
		pro.load(in);
		String builder = (String) pro.get("Builder");
		VideoPlayerBuilder vb = (VideoPlayerBuilder) Class.forName(builder).newInstance();
		VideoPlayerBuilderController vbc = new VideoPlayerBuilderController();
		VideoPlayer vp = vbc.createPlayerByType(vb);
		System.out.println(vp);
	}
}
