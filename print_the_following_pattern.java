import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j==0 || i==j || i==n-1)
                    System.out.format("*");
                else
                    System.out.format(" ");
            }
            System.out.format("
");
        }
    }
}