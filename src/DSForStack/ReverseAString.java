package DSForStack;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String s = "Tests";
		char[] chars = s.toCharArray();

		for(int i=0, j=s.length()-1; i<s.length()/2;i++, j--){
			
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			
		}
		System.out.print("Reverse String: ");
		for (char c : chars) {
			System.out.print(c);
		}
		
		
	}

}
