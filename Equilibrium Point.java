import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int p[] = new int[n];
        int s[] = new int[n];
        p[0]=arr[0];
        s[n-1]=arr[n-1];
        for(int i = 1 ; i < n ; i++){
            p[i]=p[i-1]+arr[i];
        }
        for(int i = n-2 ; i > -1 ; i--){
            s[i]=s[i+1]+arr[i];
        }
        int c=0;
        for(int  i = 0 ; i < n; i++){
            if(p[i]==s[i]){
                c=i+1;
                break;
            }
        }
        if(c!=0)System.out.println(c);
        else System.out.println(-1);
    }
}
