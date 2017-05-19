package pattern.composite;

public class Window extends Container{
	private void disp() {
		// TODO Auto-generated method stub
		System.out.println("显示窗口");
		super.display();
		System.out.println("显示信息栏");
	}
}
