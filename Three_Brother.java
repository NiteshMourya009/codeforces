import java.util.Scanner;

public class Three_Brother {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int a= sc.nextInt() ;
        int b= sc.nextInt() ;

        for(int i=1; i<=3; i++){
            if(a!=i && b!=i){
                System.out.println(i);
                break ;
            }
        }
    }
}
