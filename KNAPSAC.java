package ALGORITHM;
public class KNAPSAC {
	static int knap(int W ,int w[],int v[],int n)
	{
		if(n==0 || W==0)
		{
			return 0;
		}
		if(w[n-1]>W)
		{
			return knap(W,w,v,n-1);
		}
		else{
			return Math.max(v[n-1]+knap(W-w[n-1],w,v,n-1),knap(W,w,v,n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = new int[] { 60, 100, 120 };
        int w[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = v.length;
        System.out.println(knap(W, w, v, n));
        System.out.println("time complexity is two power 2^n");


	}

}

