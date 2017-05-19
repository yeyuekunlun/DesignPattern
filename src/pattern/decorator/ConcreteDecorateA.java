package pattern.decorator;

public class ConcreteDecorateA extends Decorate{

	public ConcreteDecorateA(String str) {
		super(str);
	}
	
	@Override
	public String encode() {
		// TODO Auto-generated method stub
		CdaEncode();
		return super.encode();
	}
	
	private String CdaEncode(){
		secret = "高级加密:"+secret;
		return secret;
	}
	private String CdaDecode(){
		secret = "高级解密:"+secret;
		return secret;
	}
	@Override
	public String decode() {
		// TODO Auto-generated method stub
		CdaDecode();
		return super.decode();
	}
}
