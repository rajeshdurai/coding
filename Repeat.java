public class Repeat {

	    void Repeating(int arr[], int size) 
	    {
	        int i, j;
	        System.out.println("Repeated Elements are :");
	        for (i = 0; i < size; i++) 
	        {
	            for (j = i + 1; j < size; j++) 
	            {
	                if (arr[i] == arr[j]) 
	                    System.out.print(arr[i] + " ");
	            }
	        }
	    }
	 
	    public static void main(String[] args) 
	    {
	        Repeat repeat = new Repeat();
	        int arr[] = {5,6,3,2,2,3,6,5,4,7};
	        int arr_size = arr.length;
	        repeat.Repeating(arr, arr_size);
	    }
	}


