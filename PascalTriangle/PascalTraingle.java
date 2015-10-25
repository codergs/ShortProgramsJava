package pascal;
import java.util.*;
public class PascalTriangle {

	
	public static void calcPascalTriangle(int [] prevRow, int currRowInd, int numRows)
	{
		int c[]=new int[numRows+1] ;
		int d=0;
		if(currRowInd<=numRows)
		{
			System.out.printf("%d. Row: ",currRowInd);
			for(int j=0;j<1;j++)//currRowInd+
			{
				while(d<1)
				  {
					c[j]=c[currRowInd]=1;
					System.out.print(c[j]+",");
					d++;
				  }
				 for(int z=1;z<currRowInd;z++)
				 {
					 c[z]=prevRow[z-1]+prevRow[z];
					 System.out.print(c[z]+",");
				 }
				 
				System.out.print(c[currRowInd]+"\n");
			}
			currRowInd++;
		
		int e[]=new int[c.length];
		for(int k=0;k<e.length;k++)
		{
			e[k]=c[k];
		}
		
		calcPascalTriangle(e,currRowInd,numRows);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows in Pascal Triangle: ");
		int row=input.nextInt();
		int a[]={1};
		System.out.print("0. Row: 1\n");
		calcPascalTriangle(a,1,row);
		
	}

}
