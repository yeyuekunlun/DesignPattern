package pattern.composite;

//Sunny�����˾������һ������ؼ��⣬����ؼ���Ϊ�����࣬һ���ǵ�Ԫ�ؼ������簴
//ť���ı���ȣ�һ���������ؼ������細�塢�м����ȣ��������ģʽ��Ƹý����
//���⡣
public class Panel extends Container{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		super.display();
		System.out.println("--------------");
	}
}
