
public class q18 {
	static boolean f(int n, int m)
	{
	if (n<2)
	{
		return false;
	}
		
	if(m>=n)
	{
		return true;
	}
	if(n%m==0)
	{
		return false;
	}
	else 
	{
    return f(n, m+1); 
    }
	
	}
	public static boolean e(int[] arr, int index) {
        if (index < 0) {
            return true;
        }

        if (f(arr[index],2)) {
            return false;
        }

        return e(arr, index - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {1,2,3,4,5}; 
		int index=Array.length-1;
		boolean answer=e(Array,index);
		System.out.println(answer);
	}

}
