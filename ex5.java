import java.util.*;

public class ex5{
   
    public static void sum1()
    {
         try{
         Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the numbers");
         String input = s.nextLine();
        
        int sum= 0;
        String []  neww = input.split(" ");
        int [] a = new int[neww.length];
        for(int i=0; i<neww.length; i++) {
            a[i] = Integer.parseInt(neww[i]);
         }
        for(int j=0;j<a.length;j++)
        {
            sum = sum+a[j];
        }
        System.out.println(sum);
    }

        catch(Exception e){
            System.out.println(" Only Integer Values");
        }
            
    }

}