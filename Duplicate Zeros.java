import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int[] res = new int[n*2];
        int x=0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==0){
                res[x++]=0;
                res[x++]=0;
            }
            else{
                res[x++]=arr[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(res[i]+" ");
        }
    }
}
