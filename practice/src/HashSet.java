import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set =new LinkedHashSet<>();
		set.add("c");
		set.add("b");
		set.add("a");
		set.add("a");
		set.add("b");
		
		System.out.println(set);

	}

}
