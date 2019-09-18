import java.util.*;


public class ex3{
    
    public static void vowel()
    {

        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the word");
        String input = s.nextLine();
        
        String neww=input;
        int j = neww.length();
        for(int i=0;i<j;i++)
        {
            char ch = input.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
                {
                    System.out.print(" vowel-"+ch);
                }
    
                else if((ch >'A'&& ch < 'Z') || (ch > 'a' && ch < 'z'))
                {
                    System.out.print(" consonant-"+ch);
                }
                else
                {
                    System.out.print("  error");
                }
        }

            
    }
      

}


