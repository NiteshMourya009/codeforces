import java.util.* ;
public class wayToLongWords {
    public static String longwords(String str){
        int n= str.length() ;
        String empty="" ;
        if(n>10){
           int p= n-2 ;
           empty= str.charAt(0)+ String.valueOf(p)+ str.charAt(n-1);
           return empty ;
        }
        return str ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt();
        String str ;
        for(int i=0 ;i<=n; i++){
            str= sc.nextLine() ;

            if(str.length()>10){
                System.out.print(str.charAt(0));
                System.out.print(str.length()-2);
                System.out.println(str.charAt(str.length()-1));
            }
            else{
                System.out.println(str) ;
            }
        }

    }
}
