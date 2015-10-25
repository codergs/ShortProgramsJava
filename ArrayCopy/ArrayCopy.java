package copy;

public class ArrayCopy {

	public static void printDoubleArray(double[] array)
	{
		System.out.print("[ ");
		for(int i=0; i<(array.length);i++)
		{
			if(i<array.length-1)
			{
			System.out.printf("%.6f, ",array[i]);
			}
			else 
			System.out.printf("%.6f ]\n",array[i]);
		}
	}
	
	public static double[]shallowCopyDoubleArray(double[] array)
	{
		double [] d;
		d=array;
		return d;
	}
	
	public static double[]deepCopyDoubleArray(double[] array)
	{
		double [] f;
		f=new double[array.length];
		for(int i=0;i<=array.length-1;i++)
		{
			f[i]=array[i];
		}
		return f;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double []a={0.100000,0.200000,0.300000,0.400000,0.500000};
		double []b;
		double []c;
		System.out.println("The Original array is:");
		printDoubleArray(a);
		System.out.println("The Shallow copy of array is:");
		b=shallowCopyDoubleArray(a);
		printDoubleArray(b);
		deepCopyDoubleArray(a);
		System.out.println("The Deep copy of array is:");
		c=deepCopyDoubleArray(a);
		printDoubleArray(c);
		
	}
	
}

