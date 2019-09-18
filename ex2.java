import java.util.*;

public class ex2{
    public static void oddeven()
    {
        
      Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the number");
         long n = s.nextLong();

             if((n%2!=0) && (n>20 && n<30))
             {

               System.out.println("Tom");
            
             }
             if((n%2==0) && (n>20 && n<30))
             {
                System.out.println("Jerry");
             }
             else
             {
              System.out.println("Not in range 20-30");
             }
       
    }
      

}


