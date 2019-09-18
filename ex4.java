import java.util.*;


public class ex4{
    
    public static void loop()
    {
        Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the number");
         int r = s.nextInt();
       
        for(int i=1;i<=r;i++)
        {
                 for(int j=1;j<=i;j++)
                 {
                    System.out.printf( " " +i);

                 }
        }
            
    }
}