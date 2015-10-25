package search;

public class BinarySearchRecursive {

	
		public static int searchIndex(int a[], int start, int end, int value){
			
			if(end>=start){
				
			int mid = (start+ end)/2;
			
			if(a[mid] > value) return searchIndex(a,start, mid-1, value);
			
			if(a[mid] < value) return searchIndex(a,mid+1, end, value);
				
			if(a[mid] == value) return mid;
			
			}
			return -1;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a[]={1,1,2,4,6,8,10,12};
			int length= a.length;
			int value = 1;
			int result = searchIndex(a,0,length-1,value);
			if(result == -1)
				System.out.println("Element not found");
			else 
				System.out.println("Element found at "+result);
			
		}

}
