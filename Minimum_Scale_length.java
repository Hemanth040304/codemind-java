import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i = 0 ; i < n ; i++){
		    if(min>arr[i]){
		        min = arr[i];
		    }
		}
		while(min>0){
		    count = 0 ;
		    for(int i = 0 ; i < n ; i++){
		        if(arr[i]%min==0){
		            count++;
		        }
		    }
		    if(count==n){
		        System.out.format("%d",min);
		        break;
		    }
		    min--;
		}
	}
}