import java.util.*;
class Love{
    public static boolean fun(int n){
        for(int i = 0 ; i*i <= n ; i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int s = 0 ;
		for(int i = 0 ; i < n ; i++){
		    if(fun(arr[i])){
		        s += arr[i];
		    }
		}
		System.out.format("%d",s);
	}
}