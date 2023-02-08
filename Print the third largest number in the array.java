import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int f=-1,s=-1,t=-1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>f) {
                if(s<f){
                    if(t<s){
                        t=s;
                    }
                    s=f;
                }
                f = arr[i];
            }
            else if(arr[i]>s && arr[i]<f){
                if(s>t){
                    t=s;
                }
                s=arr[i];
            }
            else if(t<arr[i] && s>arr[i]){
                t=arr[i];
            }
        }
        if(t==-1 || s==-1){
            System.out.println("It is not possible");
        }
        else {
            System.out.println(t);
        }
    }
}
