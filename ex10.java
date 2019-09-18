import java.util.*;


public class ex10{
  
    public static void repeat()
    {

        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the word");
        String input = s.nextLine();
        System.out.println("Enter the number");
        int n = s.nextInt();
        String neww=input;
        int j = neww.length();
        String su = input;
       for(int k=0;k<n;k++){
        for(int i=j-n;i<j;i++)
        {
            char ch = input.charAt(i);
          
             char ch1 = ch;
             String yes=Character.toString(ch);
             su = su+yes;
             
           
                
        }
    }
        System.out.println(su);


    
            
    }
      

}


