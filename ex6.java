import java.util.*;


public class ex6{
  

    public static void Capital()
    {
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the input");
        char c = s.next().charAt(0); 
             if((c >='A')&& (c<='Z'))
             {
                 System.out.println("Capital letter");
             }

            else if((c>='a')&& (c<='z'))
             {
                 System.out.println("small letter");
             }

            else if ((c>='1')&& (c<='9'))
             {
                 System.out.println("digits");
             }

            else
            {
                System.out.println("Special letter");
            }
       
    }

}



