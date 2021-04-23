import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	public static void main(String args[]) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("name",19292);
		hm.put("age",24);
		hm.put("rating",5);
		
		System.out.println(hm);
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println("key: "+m.getKey()+ " value "+ m.getValue());
		}
		
	}
}


	
	
