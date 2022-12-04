import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0;
		for(int i = a ; i < b+1 ; i++){
		    int x=0;
		    for(int j = i ; j < b+1 ; j++){
		        x+=j;
		        if(x%2!=0){
		            c++;
		        }
		    }
		}
		System.out.format("%d",c);
	}
}