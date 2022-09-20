import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==j){
                    System.out.format("0");
                }
                else
                System.out.format("x");
            }
            System.out.format("
");
        }
    }
}