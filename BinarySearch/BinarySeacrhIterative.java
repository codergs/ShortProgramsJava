package search;

public class BinarySeacrhIterative {

	
		public static int searchIndex(int a[], int start, int end, int value){
			
			while(start<=end){
				
			int mid = start+ (end-start)/2;
			
			if(a[mid] > value) end = mid-1;
			
			if(a[mid] < value) start = mid+1;
				
			if(a[mid] == value) return mid;
			
			}
			return -1;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a[]={1,2,4,5,6,8,9};
			int length= a.length;
			int value = 4;
			int result = searchIndex(a,0,length-1,value);
			if(result == -1)
				System.out.println("Element not found");
			else 
				System.out.println("Element found at index"+result);
			
		}

	}