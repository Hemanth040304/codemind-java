import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c=0;
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            c-=a[i];
        }
        for(int i = 0 ; i < n ; i++){
            b[i] = sc.nextInt();
            c+=b[i];
        }
        if(c<0){
            System.out.format("0");
        }
        else{
            System.out.format("%d",c);
        }
    }
}