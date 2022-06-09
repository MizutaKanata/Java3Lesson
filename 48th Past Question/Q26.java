
import java.util.Map;
import java.util.TreeMap;

public class Q26 {

	public static void main(String[] args) {
		Map<Integer,String> members =
				new TreeMap<Integer,String>();
		members.put(777, "Andy");
		members.put(234,"Betty");
		members.put(562, "Carl");
		
		for(String name : members.values()) {
			System.out.printf("%s",name);
		}
	}

}
