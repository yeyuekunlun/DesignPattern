package pattern.composite;

public class Client {
	public static void main(String[] args) {
		Window win = new Window();
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Button btn1 = new Button();
		Button btn2 = new Button();
		TextEditer t1 = new TextEditer();
		TextEditer t2 = new TextEditer();
		panel1.add(t1);
		panel1.add(t2);
		panel2.add(btn1);
		panel2.add(btn2);
		win.add(panel1);
		win.add(panel2);
		win.display();
		}
}
