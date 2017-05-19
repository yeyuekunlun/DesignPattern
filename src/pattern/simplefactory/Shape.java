package pattern.simplefactory;

public abstract class Shape {
	public abstract void draw();
	public void erase(){
		System.out.println("擦除");
	};
}


