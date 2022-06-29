import java.util.HashMap;

public class Q29 {

	public static void main(String[] args) {
		HashMap<String,Integer> wordCount =
				new HashMap<>();
		wordCount.put("Tree", 15);
		wordCount.put("Cow", 3);
		wordCount.put("Tree",27);
		for(String str : wordCount.keySet()) {
			System.out.println(str);
		}
	}

}
