package pattern.abstractFactory;

public class WindowsOIFactory implements GameOIFactory{

	@Override
	public OperationController operationFactory() {
		// TODO Auto-generated method stub
		return new WindowsOperationController();
	}

	@Override
	public InterfaceController displayFactory() {
		// TODO Auto-generated method stub
		return new WindowsInterfaceController();
	}


}
