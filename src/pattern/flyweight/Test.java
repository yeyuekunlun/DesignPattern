package pattern.flyweight;

public class Test {
	public static void main(String[] args) {
		String t1 = "abcd";
		String t2 = "abcd";
		System.out.println("t1:"+t1.hashCode());
		System.out.println("t2:"+t2.hashCode());
		System.out.println(t1==t2);
		String t3 = "ab"+"cd";
		System.out.println("t3:"+t3.hashCode());
		System.out.println(t3==t1);
	}
}
