package pattern.adapter;

import java.security.NoSuchAlgorithmException;

public class Client {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Target t = new Adapter();
		String res = t.encode("hello");
		System.out.println(res);
	}
}
