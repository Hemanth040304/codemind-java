import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0 , s= 1;
		int ne = f+s;
		int c=0;
		while(ne<=n){
		    f = s;
		    s = ne;
		    ne = f+s;
		    if(ne==n){
		        c = 1;
		        System.out.format("True");
		        break;
		    }
		}
		if(c==0){
		    System.out.format("False");
		}
	}
}