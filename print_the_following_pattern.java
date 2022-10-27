import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i-1 ; j++){
                System.out.printf(" ");
            }
            for(int k = 1 ; k <= n ; k++){
                if(i==n || i==1 || k==1 || k==n){
                    System.out.format("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("
");
        }
    }
}