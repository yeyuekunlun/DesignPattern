package pattern.decorator;

public class Client {
	public static void main(String[] args) {
		String str = "jiashiwei";
		Decorate a,b,c;
		a = new ConcreteDecorateA(str);
		b = new ConcreteDecorateB(str);
		
	}
}
