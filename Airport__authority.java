import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            if(arr[i]<=t){
                x++;
            }
            else{
                x+=2;
            }
        }
        System.out.format("%d",x);
        
    }
}