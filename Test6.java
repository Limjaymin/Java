import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		String s;
		int i;
		double d;
		
		Scanner c = new Scanner(System.in);
		System.out.print("문자열: ");
		s = c.nextLine();
		System.out.print("정수: ");
		i = c.nextInt();
		System.out.print("실수: ");
		d = c.nextDouble();
		System.out.println(s+" "+i+" "+d);
		
	}

}
