import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>1;i--){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.printf("%d ",j);
                }
                else{
                    System.out.printf("%d ",i);
                }
            }
            for(int j=2;j<=n;j++){
                if(j>i){
                    System.out.printf("%d ",j);
                }
                else{
                    System.out.printf("%d ",i);
                }
            }
            System.out.printf("\n");
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.printf("%d ",j);
                }
                else{
                    System.out.printf("%d ",i);
                }
            }
            for(int j=2;j<=n;j++){
                if(j>i){
                    System.out.printf("%d ",j);
                }
                else{
                    System.out.printf("%d ",i);
                }
            }
            System.out.printf("\n");
        }
    }
}
