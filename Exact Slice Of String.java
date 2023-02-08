import java.util.*;
public class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i = s ; i < e+1 ; i++){
            System.out.print(a.charAt(i)+"");
        }
    }
}
