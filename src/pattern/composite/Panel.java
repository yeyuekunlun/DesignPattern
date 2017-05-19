package pattern.composite;

//Sunny软件公司欲开发一个界面控件库，界面控件分为两大类，一类是单元控件，例如按
//钮、文本框等，一类是容器控件，例如窗体、中间面板等，试用组合模式设计该界面控
//件库。
public class Panel extends Container{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		super.display();
		System.out.println("--------------");
	}
}
