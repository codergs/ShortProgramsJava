package stringReverse;

public class ReverseAString {
	
	private static void reverseString(String s){
		char[] c=s.toCharArray();
		char temp;
		for(int i=0;i<c.length/2;i++){
			temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;
		}
	
		for(int k=0;k<c.length;k++)
			System.out.print(c[k]+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("hellospe");
	}

}
