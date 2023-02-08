import java.util.*;
class Codechef {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i: hs)
        {
            l.add(i);
        }
        Collections.sort(l);
        Collections.reverse(l);
        if(l.size()<3)
        {
            System.out.print("It is not possible");
        }
        else
        {
            System.out.println(l.get(2));
        }
    }
}
