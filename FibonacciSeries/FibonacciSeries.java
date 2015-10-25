package series;

public class FibonacciSeries {

	private static int fib(int n){
        return n<=1?n: fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
			System.out.print(fib(i)+" ");
	}

}
