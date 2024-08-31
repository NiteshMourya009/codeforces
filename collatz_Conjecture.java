import java.util.Scanner;

public class collatz_Conjecture {
    public static int val(int x, int y, int k){

        for(int i=0; i<k; i++){
            x++ ;
            while(x%y==0){
                x= x/y ;
            }
        }
        return x ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int t= sc.nextInt() ;

        while(t != 0){
            int x= sc.nextInt() ;
            int y=sc.nextInt();
            int k= sc.nextInt() ;


            System.out.println(val(x,y,k));

        }
    }
}
