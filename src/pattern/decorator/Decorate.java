package pattern.decorator;

public class Decorate{

	protected String secret;
	
	public Decorate(String str) {
		// TODO Auto-generated constructor stub
		this.secret = str;
	}
	
	public String encode() {
		// TODO Auto-generated method stub
		return secret;
	}

	public String decode() {
		// TODO Auto-generated method stub
		return secret;
	}

}
