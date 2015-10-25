package stringReverse;

public class RecursiveReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		       
		String reverseStr = reverseRecurive(str);
		
		System.out.println("Normal String is : " + str + " \nReverse String is : "+reverseStr);    		
	}

	public static String reverseRecurive(String str) {

		if (str.length() <= 1) 
			return str;
		return reverseRecurive(str.substring(1)) + str.charAt(0);
	}
}


