import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0;i < 10;i++) 
			System.out.println(i+" ");
		System.out.println("");
		
		int [] a = {100,200,300};
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);l.add(101);l.add(102);
		for (Integer i : l)
			System.out.print(i+" ");
		System.out.println("");
		}

	}

