package pattern.composite;

import java.util.LinkedList;
import java.util.List;

public class Container extends Component{

	private List<Component> comList = new LinkedList<>();
	
	public void add(Component component) {
		// TODO Auto-generated method stub
		comList.add(component);
	}

	public void remove(Component component) {
		// TODO Auto-generated method stub
		comList.remove(component);
	}

	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return comList.get(i);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (Component component : comList) {
			component.display();
		}
	}

}
