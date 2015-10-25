
package stringReverse;

public class ReverseWordString{
   
    public static  void main(String[] args) {
        String s = "Neil Peart rocks YYZ";
        String[] str =s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for(int i=str.length-1;i>=0;i--)
        {
            buffer.append(str[i]);
            buffer.append(" ");
        }
        s=buffer.toString();
        System.out.println("Reverse word string:"+s);
    }
}


