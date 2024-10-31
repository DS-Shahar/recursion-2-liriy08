
public class q20 {
	public static boolean f( int[]arr,int start, int end)
	{
		if(start>=end)
		{
			return true;
		}
		if (arr[start] != arr[end]) {
            return false;
        }
	
		return f(arr, start+1, end-1);
		
		
		}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 1};
		int start=0;
		int end=4;
		boolean answer=f( arr,start,end);
		System.out.println(answer);
	}

}
