import java.util.Scanner;

public class Ex15 {
     public static void main( String[] arg){
        Scanner sc = new Scanner( System.in );

        System.out.print("�̸�:");
        String name = sc.next();
        
        System.out.print("����:");

        int score = sc.nextInt();

        System.out.println( name+" " + (score*2) );
          

          
     }
}
