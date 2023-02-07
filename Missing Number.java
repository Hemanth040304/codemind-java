import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int x=0;
		for(int i = 0 ; i < n-1 ; i++){
		    arr[i] = sc.nextInt();
		    x+=arr[i];
		}
		int sumofn = n*(n+1)/2;
		System.out.println(sumofn-x);
	}
}
