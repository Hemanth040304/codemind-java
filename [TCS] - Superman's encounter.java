import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>296){
                arr[i]%=296;
            }
            if(arr[i]%10==0)
            System.out.format("sunday\n");
            else if(arr[i]%10==1)
            System.out.format("monday\n");
            else if(arr[i]%10==2)
            System.out.format("tuesday\n");
            else if(arr[i]%10==3)
            System.out.format("wednesday\n");
            else if(arr[i]%10==4)
            System.out.format("thursday\n");
            else if(arr[i]%10==5)
            System.out.format("friday\n");
            else if(arr[i]%10==6)
            System.out.format("saturday\n");
            else if(arr[i]%10==7)
            System.out.format("kryptonday\n");
            else if(arr[i]%10==8)
            System.out.format("coluday\n");
            else if(arr[i]%10==9)
            System.out.format("daxamday\n");
        }
    }
}
