import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            //System.out.format("%d ",arr[i]);
        }
        //System.out.format("
");
        for(int i = 0 ; i < n ; i++){
            if(i==0){
                System.out.format("-1 ");
            }
            else{
                int x=-1;
                for(int j = i ; j >= 0 ; j--){
                    if(arr[i]>arr[j]){
                        if(x==-1){
                            x=arr[j];
                            break;
                        }
                        else if(x>arr[j]){
                            x=arr[j];
                            break;
                        }
                    }
                }
                System.out.format("%d ",x);
            }
        }
    }
}