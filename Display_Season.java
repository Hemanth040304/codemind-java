import java.util.*;
class Code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==4 || n==5 || n==6){
            System.out.format("Summer");
        }
        else if(n==7 || n==8 || n==9 || n==10){
            System.out.format("Rainy");
        }
        else if(n==11 || n==12 || n==1){
            System.out.format("Winter");
        }
        else if(n==2 || n==3){
            System.out.format("Spring");
        }
        else{
            System.out.format("-1");
        }
    }
}