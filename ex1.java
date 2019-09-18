import java.util.Scanner;

public class ex1{
    
    public static void palindrome(){
        Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the number");
         long n = s.nextLong();
        long r=0;
        long a= n;
        long i=0;

        long sum=0;
        while(n!=0){
             i=n%10;
             if(i%2==0){
                 sum= sum+i;
             }
             r= r*10+i;
             n=n/10;
        }
        if (r==a)
        {
            if(sum>25)
            {
                System.out.println("Number is palindrome and sum is greater than 25");
             }
             else
             {
                System.out.println("Number is  palindrome and sum is less than 25");
             }
        }
            
       else 
       {
           System.out.println("Number is not a palindrome");
       }


    }
}
