package practiceRestartOne;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapPractice {
	
	public static void main(String[] arghs) {
		
	
	HashMap<String,Object> hMap = new HashMap<String,Object>();

	hMap.put("peter",new MapPractice());
	hMap.put("brian",'d');
	hMap.put("stewie","child");

	System.out.println("Printing Map Elements:");
	System.out.println(hMap);
	System.out.println("size of Map:" + hMap.size());
	System.out.println("Removing Elements from map");
	hMap.remove("brian");
	System.out.println(hMap);
	System.out.println("After adding Elements to the map");
	hMap.put("joe","Police Officer");
	hMap.put("quagmire", "pilot");
	hMap.put("Cleveland","Mail Man");
	System.out.println(hMap);
	
	Set<String> set = hMap.keySet();
	System.out.println("Printing Keys of hMap");
	System.out.println(set);

	
	Iterator<String>itr = set.iterator();

	while(itr.hasNext()) {
			
		String temp = itr.next();
		System.out.print(temp +" : ");
		System.out.println(hMap.get(temp));
		
		
	  }
	 
	
	}
}
