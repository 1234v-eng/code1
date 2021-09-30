package ALGORITHM;

public class Bruteforce_subset_sum {
	static boolean subset(int arr[],int sum,int n)
	{
		if(sum==0)
		{
			return true;
		}
		if(n==0)
		{
			return false;
		}
		if(arr[n-1]>sum)
		{
			return subset(arr,sum,n-1);
		}
		return subset(arr,sum,n-1) || subset(arr,sum-arr[n-1],n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = arr.length;
        if (subset(arr, sum,n) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
        System.out.println("fuck you");

	}

}
