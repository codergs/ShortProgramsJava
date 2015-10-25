package input;
import java.io.*;
public class BufferedRead {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader in =new FileReader("numbers_vertical.txt");
		BufferedReader br = new BufferedReader(in);
		try 
		{
			String line;
			while((line=br.readLine())!=null){
				 System.out.println(line);
			 }
             in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}