import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int c = 0;
		int s = 0;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
		    for(int j = i ; j < n ; j++){
		        s+=arr[j];
		        if(s==m){
		            c+=1;
		        }
		        if(s>m){
		            break;
		        }
		    }
		    s=0;
		}
		System.out.format("%d",c);
	}
}
