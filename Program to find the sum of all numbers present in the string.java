import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        int s=0;
        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i)=='1'){
                s+=1;
            }
            else if (a.charAt(i)=='2') {
                s+=2;
            }
            else if (a.charAt(i)=='3') {
                s+=3;
            }
            else if (a.charAt(i)=='4') {
                s+=4;
            }
            else if (a.charAt(i)=='5') {
                s+=5;
            }
            else if (a.charAt(i)=='6') {
                s+=6;
            }
            else if (a.charAt(i)=='7') {
                s+=7;
            }
            else if (a.charAt(i)=='8') {
                s+=8;
            }
            else if (a.charAt(i)=='9') {
                s+=9;
            }
        }
        System.out.println(s);
    }
}
