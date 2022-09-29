import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int c = 0 ;
		    for(int i = 0 ; i < n ; i++){
		        c = 0 ;
		        for(int j = 0 ; j < n ; j++){
		            if(s.charAt(i)==s.charAt(j) && i!=j){
		                c++;
		            }
		        }
		        if(c==0){
		            System.out.format("%c
",s.charAt(i));
		            break;
		        }
		    }
		    if(c!=0){
		        System.out.print("-1
");
		    }
		}
	}
}