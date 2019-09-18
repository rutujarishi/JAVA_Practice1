import java.util.*;

public class ex7{
    
    public static void reverse()
    {
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number");
        String input = s.nextLine();
        char a[] = input.toCharArray(); 
          int sum =0;
        Arrays.sort(a);
        int j= a.length;
            for(int i=(j-1);i>=0;i--)
            {
                System.out.print(a[i]);
            }
        for(int i=0;i<j;i++)
            {
                if(a[i]%2==0){
                    sum = sum+a[i];
                    
                }
               
            }
            System.out.println("Sum of even numbers is" + sum);
                if(sum>15){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            
     

            
    }
}