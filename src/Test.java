
public class Test {
	
	public static void main(String[] args) {
		
		int a[] = {1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int b[] = new int[a.length/2];
		int c[] = new int[a.length/2];
		
		System.out.println(a.length);
		
		for (int i : a) {
			if (i<a.length/2) {
				System.out.println("*************");
				
			}
			
		}
		
	}

}
