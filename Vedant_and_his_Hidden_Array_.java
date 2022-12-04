import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==1){
                if(b%2==0){
                    System.out.format("Even
");
                }
                else{
                    System.out.format("Odd
");
                }
            }
            else if(b%2==1){
                if(a%2==0){
                    System.out.format("Even
");
                }
                else{
                    System.out.format("Odd
");
                }
            }
            else{
                System.out.format("Impossible
");
            }
        }
    }
}