
public class q17 {
	public static boolean f( int[]arr, int i)
	{
		if(i<1)
		{
			return true;
		}
		
			 if(arr[i]<arr[i-1])
			 {
				 return false;

			 }
			 else 
			 {
				 return f(arr, i-1);
			 }
		 }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {1,2,3,4,5}; 
		int index=Array.length-1;
        boolean result = f(Array, index);
        System.out.println(result);
	}

}
