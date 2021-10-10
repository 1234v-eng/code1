package ALGORITHM;

public class Longest_comman_subsequence {
	static int sub(String x,String y,int n,int m)
	{
		if(n==0 ||  m==0)
		{
			return 0;
		}
		if(x.charAt(n-1)==y.charAt(m-1))
		{
			return 1+sub(x,y,n-1,m-1);
		}
		else{
			return Math.max(sub(x,y,n-1,m),sub(x,y,n,m-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="1111111";
		//String s2="2222222";
		String s1="abcdgh";
		String s2="abedfh";

		System.out.println(sub(s1,s2,s1.length(),s2.length()));
		System.out.println("keep doing it and work hard");
		System.out.println("Do smart work");


	}

}
