import java.util.*;
class Code{
    public static int prime(int n){
        if(n==1)return 0;
        for(int i = 2 ; i < n ; i++){
            if(n%i==0)return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(prime(a+b)==1){
                System.out.println("tevitt");
            }
            else{
                System.out.println("Satya");
            }
        }
    }
}
