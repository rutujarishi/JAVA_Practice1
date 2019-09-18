import java.util.*;

public class ex9{
   
        
    public static void reverse()
    {
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the word");
        String input = s.nextLine();
        char a[] = input.toCharArray(); 
        int j= a.length;
            for(int i=(j-1);i>=0;i--)
            {
                System.out.print(a[i]);
            }
    
    }
}