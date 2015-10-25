package bernaulli;

import java.util.*;

public class BernaulliNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double a,b[];
		System.out.print("Enter the number of Bernaulli's number needed:");
		a=input.nextInt();
		b=new double [(int)a];
		b=calcBernoulli((int)a);
		
	}

	public static double[] calcBernoulli(int number)
	{
		double c[]= new double[number];
		double d[]= new double[number];
		double fact;
		d[0]=c[0]=1;
		
		if(number==1)
		{
			System.out.printf("%.4f ",d[0]);
		}
		
		 if(number>1)
		{
			System.out.printf("%.6f ,",d[0]);
			for(int i=1;i<number;i++)
			{
				c[i]=0;
				for(int j=0;j<i;j++)
				{
					fact= factorial(i)/(factorial(i-j)*factorial(j));
					c[i]+=(fact*d[j])/(i-j+1);
					d[i]=1-c[i];
				}
				
				d[i]=1-c[i];
				if(i!=number-1)
					{
						System.out.printf("%.6f ,",d[i]);
					}
				else
					{
						System.out.printf("%.6f ",d[i]);
					}
			}
			
		}
		return c;
	}
	
	public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
	
}
