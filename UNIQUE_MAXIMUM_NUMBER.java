import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int max = -1;
		for(int i = 0 ; i < n ; i++){
		    int c=0;
		    for(int j = 0 ; j < n ; j++){
		        if(arr[i]==arr[j]){
		            c++;
		        }
		    }
		    if(c==1){
		        if(max<arr[i]){
		            max=arr[i];
		        }
		    }
		}
		System.out.format("%d",max);
	}
}