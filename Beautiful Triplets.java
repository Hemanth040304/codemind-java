//https://www.thecodemind.io/app/discription.php?pageCategory=c3pzTm1NaHFsYWVCeFpGMVpkTDloZz09&Tid=ZjFaVjBsNUJHcG0wRVN3eTVCdW9VUT09&Pid=V0VzNkFJVFhTSG9Xb3ppSzA4VnFIQT09&Course=TjNGdGFBMDNTZDJXMUJDWFczMnZnZz09&Technology=UG1wb1FrNnNIV3ZLcktaaTJjVGNNdz09&Topic=RFFLWjRDMFN1L0JQMS9ROWtSUisyQT09

import java.util.*;
class Solution{
    public static int min(int n, int[] arr){
        int m = 1001;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]<m && arr[i]!=0){
                m = arr[i];
            }
        }
        return m;
    }
    public static int zero(int n, int[] arr){
        int c = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]!=0){
                c++;
            }
        }
        return c;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		while(zero(n,arr)!=0){
		    System.out.format("%d\n",zero(n,arr));
		    int m = min(n,arr);
		    for(int i = 0 ; i < n ; i++){
		        if(arr[i]!=0){
		            arr[i]-=m;
		        }
		    }
		}
	}
}
