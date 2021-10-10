 package ALGORITHM;

public class Unbounded_knapsack {
	static int kanp(int w[],int v[],int n,int W)
	{
		int t[][]=new int[n+1][W+1];
		for(int i=0; i<n+1; i++)
		{
			for(int j=0; j<W+1; j++)
			{
				if(i==0 || j==0)
				{
					t[i][j]=0;
				}
			}
		}
		
		for(int i=1; i<n+1; i++)
		{
			for(int j=1; j<W+1; j++)
			{
				if(w[i-1]<=j)
				{
					t[i][j]=Math.max(v[i-1]+t[i][j-w[i-1]],t[i-1][j]);
				}
				else{
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[n][W];

   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method student
		    int W = 100;
	        int v[] = {10, 30, 20};
	        int w[] = {5, 10, 15};
	        int n = v.length;
	     System.out.println(kanp(w,v,n,W));
	     System.out.println("time complexity is (n*W)");

	}

}
