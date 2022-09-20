import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==j || j+i==n-1){
                    System.out.format("x");
                }
                else
                System.out.format("0");
            }
            System.out.format("
");
        }
    }
}