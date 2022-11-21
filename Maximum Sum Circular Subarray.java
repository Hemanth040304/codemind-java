import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int m = -1000;
        int s = 0;
        for(int k = 0 ; k < n ; k++){
            int ft = arr[0];
            arr[0] = arr[n-1];
            for(int i = 1 ; i < n ; i++){
                int t = arr[i];
                arr[i] = ft;
                ft = t;
            }
            for(int i = 0 ; i < n ; i++){
                s = 0;
                for(int j = i ; j < n ; j++){
                    s+=arr[j];
                    if(m<s){
                        m=s;
                    }
                }
            }
        }
        System.out.format("%d",m);
    }
}
