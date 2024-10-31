
public class q16 {
	public static int f( int[]arr,int num, int i)
	{
		if(i<0)
		{
			return -1;
		}
		
		 if(arr[i]==num)
		 { 
		return i;
		 }
		 else
		 {
			 return f(arr,num, i-1);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {1,-2,3,-4,5}; 
		int index=Array.length-1;
        int result = f(Array, 3,index);
        System.out.println(result);
	}

}
