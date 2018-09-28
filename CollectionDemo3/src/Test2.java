import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		Map<String, Integer> age = new HashMap<String, Integer>();
		age.put("Mark", 31);
		age.put("Moges", 37);
		age.put("Stevens", 23);

		System.out.println(age);

		LinkedHashMap<String, Integer> age2 = new LinkedHashMap<>(age);

		System.out.println(age2);
		
		//Invoking the non no-arg constructor to get a sorted list back
		Map<String, Integer> age4 = new LinkedHashMap<>(3, 0.75f, true);
		age4.put("Mark", 31);
		age4.put("Moges", 37);
		age4.put("Stevens", 23);
		System.out.println(age4);

		TreeMap<String, Integer> age3 = new TreeMap<>(age);

		System.out.println(age3);

	}
	//Conclusion
	//HashMap is unsorted. 
	//LinkedHashMap is not ordered if we use the no arg constructor. We can choose between insertion order
	// and Access order when using LinkedHashMap.
	//TreeMap is ordered on Keys.

}
