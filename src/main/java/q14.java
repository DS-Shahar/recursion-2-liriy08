
public class q14 {
	public static int f( int[]arr,int i)
	{
		if(i<0)
		{
			return 0;
		}
		
		return arr[i]+f(arr,i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] Array = {1,2,3,4,5}; 
        int result = f(Array, 3);
        System.out.println(result);
	}

}
