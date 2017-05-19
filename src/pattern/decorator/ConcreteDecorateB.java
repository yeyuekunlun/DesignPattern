package pattern.decorator;

public class ConcreteDecorateB extends Decorate{

	public ConcreteDecorateB(String secret) {
		super(secret);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String encode() {
		// TODO Auto-generated method stub
		CdaEncode();
		return super.encode();
	}
	
	private String CdaEncode(){
		secret = "MD5º”√‹:"+secret;
		return secret;
	}
	private String CdaDecode(){
		secret = "Md5Ω‚√‹:"+secret;
		return secret;
	}
	@Override
	public String decode() {
		// TODO Auto-generated method stub
		CdaDecode();
		return super.decode();
	}
}
