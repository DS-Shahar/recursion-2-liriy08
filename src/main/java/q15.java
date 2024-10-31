
public class q15 {
	public static int f( int[]arr,int i)
	{
		if(i<0)
		{
			return 0;
		}
		
		 if(arr[i]>0)
		 { 
		return 1+f(arr, i-1);
		 }
		 else
		 {
			 return f(arr, i-1);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {1,-2,3,-4,5}; 
        int result = f(Array, 3);
        System.out.println(result);
	}

}
