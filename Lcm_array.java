package math;

public class Lcm_array {
	static  int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
	static  int lcm(int a,int b)
	{
		return ((a*b)/gcd(a,b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={1, 2, 8, 3};
		System.out.println(lcm(3,10));
		System.out.println(gcd(12,30));

		int arr[] = { 2, 7, 3, 9, 4 };
		int res=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			res=lcm(res,arr[i]);
		}
		System.out.println(res);
		

	}

}
