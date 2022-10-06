
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a1 = new int[2][3];
		System.out.println("a1.length="+a1.length);
		System.out.println("a1[0].length="+a1[0].length);
		for(int line=0;line < a1.length;line++) {
			for(int n : a1[line])
				System.out.println(n+" ");
			System.out.println("");
		}
	}

}
