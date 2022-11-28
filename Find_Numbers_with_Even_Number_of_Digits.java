import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c = 0;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    int t = arr[i];
		    int x=0;
		    while(t>0){
		        t/=10;
		        x++;
		    }
		    if(x%2==0){
		        c++;
		    }
		    
		}
		System.out.println(c);
		
	}
}