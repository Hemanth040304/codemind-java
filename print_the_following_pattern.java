import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-(i+1) ; j++){
                System.out.format(" ");
            }
            for(int j = i ; j > 0 ; j--){
                System.out.format("%d",i+1);
            }
            for(int j = 0 ; j < i+1 ; j++){
                System.out.format("%d",i+1);
            }
            System.out.format("
");
        }
    }
}