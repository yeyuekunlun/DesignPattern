package pattern.flyweight;

import java.util.HashMap;

public class PictureViewFactory {
	private static PictureViewFactory factury;
	private static HashMap<String, PictureView> map = new HashMap<String, PictureView>();
	private PictureViewFactory(){
		map.put("scroll", new ScrollPictureView());
		map.put("waterFall", new WaterfallPictureView());
	}
	
	public static PictureViewFactory getFacture(){
		if(factury==null){
			factury = new PictureViewFactory();
		}
		return factury;
	}

	public PictureView getInstance(String key){
		if(map.containsKey(key)){
			return (PictureView)map.get(key);
		}else{
			return null;
		}
	}
}
