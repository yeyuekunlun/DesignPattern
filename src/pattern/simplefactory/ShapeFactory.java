package pattern.simplefactory;

public class ShapeFactory {
	public static Shape getShape(String type){
		if(type!=null && type.equals("Circle")){
			return new Circle();
		}else if(type!=null && type.equals("Square")){
			return new Square();
		}else{
			throw new UnSupportedShapeException();
		}
	}
}
