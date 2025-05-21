import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		System.out.println("------Hashmap------");
		HashMap hm = new HashMap();
		hm.put("Dinesh", 100);
		hm.put("Raja", 101);
		hm.put("Kolasani", 102);
		hm.put("Dinesh", 103);
		hm.put(null, 104);
		
		System.out.println("Hashmap list : " + hm);
		System.out.println("get( Dinesh ) value: " + hm.get("Dinesh"));
		System.out.println("get(null) : " + hm.get(null));


		System.out.println("------Linked Hashmap------");
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Dinesh", 100);
		lhm.put("Raja", 101);
		lhm.put("Kolasani", 102);
		lhm.put("Dinesh", 103);
		lhm.put(null, 104);
		
		System.out.println("Linked Hashmap list : " + lhm);
		System.out.println("get( Dinesh) value: " + lhm.get("Dinesh"));
		System.out.println("get(null) : " + lhm.get(null));


		System.out.println("------Treemap------");
		TreeMap tm = new TreeMap();
		tm.put("Dinesh", 100);
		tm.put("Raja", 101);
		tm.put("Kolasani", 102);
		tm.put("Dinesh", 103);
		
		System.out.println("Treemap list : " + tm);


	}
}  