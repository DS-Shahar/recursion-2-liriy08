
public class q19 {
	public static int f( int[][]arr,int num, int i)
	{
		if(i<0)
		{
			return 0;
		}
		int count=0;
		for (int j=0; j <arr[i].length; j++) {
            if (arr[i][j] ==num) {
               count++;
            }
		}     
            return count+ f(arr,num, i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Array = {{1,2,3},{6,7,1},{4,1,5}}; 
		int index=Array.length-1;
		int numFound=1;
		int answer=f(Array,numFound,index);
		System.out.println(answer);
	}

}
