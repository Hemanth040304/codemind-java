import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int data = 0;
        for(int i = 0 ; i < n-1 ; i++){
            data+=Math.abs((int)str.charAt(i+1)-(int)str.charAt(i));
        }
        data = n-1-data;
        if(data%3==0){
            System.out.println("Sudhir");
        }
        else{
            System.out.println("Ashok");
        }
    }
}
