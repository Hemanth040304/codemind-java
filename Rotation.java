import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i < k ; i++){
                int m = arr[n-1];
                for(int j = n-1 ; j > 0 ; j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=m;
            }
            for(int i = 0 ; i < n-1 ; i++){
                System.out.format("%d ",arr[i]);
            }
            System.out.format("%d
",arr[n-1]);
        }
    }
}