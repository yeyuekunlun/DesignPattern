package pattern.decorator;

abstract class Secret {
	public abstract String encode(String str);
	public abstract String decode(String str);
}
