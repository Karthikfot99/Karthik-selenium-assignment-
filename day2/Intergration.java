package week1.day2;

public class Intergration {

	public static void main(String[] args) {
		int a[]={0,9,7,6,4,22};
		int b[]={7,1,8,33,9,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
				System.out.println("the intersection is"+a[i]);
			}
			}
			
		}
	
	}

}