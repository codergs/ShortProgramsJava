package input;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ScannerClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	String curDir = System.getProperty("user.dir");
	System.out.println(curDir);
	Scanner s =new Scanner(new FileReader("numbers_vertical.txt"));

	while(s.hasNextInt()){
		System.out.println(s.nextInt());
	}

}
}
