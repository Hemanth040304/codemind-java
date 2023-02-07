import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] ans = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    ans[i] = arr[i]*arr[i];
		}
		for(int i = 0 ; i < n ; i++){
		    for(int j = 0 ; j < n ; j++){
		        if(ans[i]<ans[j]){
		            ans[i] = ans[i]^ans[j];
		            ans[j] = ans[i]^ans[j];
		            ans[i] = ans[i]^ans[j];
		        }
		    }
		}
		for(int i = 0 ; i < n ; i++){
		    System.out.format("%d ",ans[i]);
		}
	}
}
