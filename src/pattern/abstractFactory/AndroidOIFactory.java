package pattern.abstractFactory;

public class AndroidOIFactory implements GameOIFactory{

	@Override
	public OperationController operationFactory() {
		// TODO Auto-generated method stub
		return new AndroidOperationController();
	}

	@Override
	public InterfaceController displayFactory() {
		// TODO Auto-generated method stub
		return new AndroidInterfaceController();
	}


}
