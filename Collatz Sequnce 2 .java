import java.util.*;
 class Codechef {
    public static int coll(int n) {
        int cont=0;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else{
                n= 3*n+1;
            }
            cont++;
        }
        return cont;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m=0,ans=0;
        for(int i = a ; i < b+1 ; i++){
            int co=coll(i);
            if(m<co){
                m=co;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
