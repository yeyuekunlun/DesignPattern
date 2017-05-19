package pattern.test;

public class Son extends Component{
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("son");
		say();
	}
	
	public void say(){
		System.out.println("appendix");
	}

	
	public static void main(String[] args) {
		Component son = new Son();
	
		son.operation();
	}
}
