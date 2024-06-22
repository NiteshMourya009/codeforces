import java.util.Scanner;

public class CandiesAnd_TwoSister {
    public static int distributCandy(int n){
        if(n<=2){
            return 0 ;
        }
        if(n%2!=0){
            return n/2 ;
        }

        return n/2 -1 ;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            System.out.println(distributCandy(n));
        }
    }
}
