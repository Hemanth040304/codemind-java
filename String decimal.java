import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String  a = sc.next();
            int c=0;
            for(int i = 0 ; i < a.length() ; i++){
                if(a.charAt(i)=='1' ||a.charAt(i)=='2' ||a.charAt(i)=='0' ||a.charAt(i)=='3' ||a.charAt(i)=='4' ||a.charAt(i)=='5' ||a.charAt(i)=='6' ||a.charAt(i)=='7' ||a.charAt(i)=='8' ||a.charAt(i)=='9' )c++;
            }
            if(c==a.length()){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
}
