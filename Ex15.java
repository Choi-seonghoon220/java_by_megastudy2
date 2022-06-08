import java.util.Scanner;

public class Ex15 {
     public static void main( String[] arg){
        Scanner sc = new Scanner( System.in );

        System.out.print("이름:");
        String name = sc.next();
        
        System.out.print("점수:");

        int score = sc.nextInt();

        System.out.println( name+" " + (score*2) );
          

          
     }
}
