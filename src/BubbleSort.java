import java.util.Arrays;

public class BubbleSort {
	
	
	public static void swap( int n , int [] arr) {
		if(arr == null) {  // base case    // if the array is empty return
			return ;        // return empty array [].
		}
		
		for(int i =0; i < n; i++) { //traverse the array
		        
		if(arr[i] > arr[i+1]) {  // compare two elements, current = arr[i] and next of current = arr[i+1] , if current  is greater than next of current  swap them
			int temp = arr[i];      // int temp; is a variable for storing the current element  arr[i] throughout the swaps
			arr[i] = arr[i+1];
			 arr[i+1] = temp;;
			
		     
		}	
		   swap(n - 1, arr);  // recur the remaining array
		}	
	}
	    // driver code
	public static  void main(String[] args) {
		int [] arr = {13,9,15,7,4}; // original array
			   swap(arr.length-1, arr);
		   System.out.println("the sorted array is : " + Arrays.toString(arr)); // sorted array
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		