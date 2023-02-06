import java.util.*;
class Solution{
    public static int revrese(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        n = revrese(n);
        int c=0;
        while(n>0){
            if(n%10==6 && c==0){
                ans = ans*10+9;
                c++;
            }
            else{
                ans = ans*10 + n%10;
            }
            n/=10;
        }
        System.out.println(ans);
    }
}
