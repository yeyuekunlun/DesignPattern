package pattern.abstractFactory;

interface GameOIFactory {
	public OperationController operationFactory();
	public InterfaceController displayFactory();
}
