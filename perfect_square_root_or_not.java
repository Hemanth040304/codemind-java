import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double f = Math.sqrt(n);
		int i = (int)f;
		if(i==f){
		    System.out.println("True");
		}
		else{
		    System.out.println("False");
		}
	}
}