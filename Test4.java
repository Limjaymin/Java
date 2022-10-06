import java.util.HashMap;
import java.util.Map;

public class Test4 {
 public static void main(String[] args) {
	 Map hm = new HashMap();
	 hm.put("Student", 1001);
	 hm.put("Teacher", 1002);
	 hm.put("School", 1003);
	 System.out.println(hm);
	 
	 hm.remove("Student");
	 System.out.println(hm);
	 System.out.println(hm.size());
	}
}
