import java.util.*;


public class ex8{
        public static void Guess(){
        
         Scanner s = new Scanner(System.in);  // Create a Scanner object
         boolean d=true;
         System.out.println("Enter the number");
         while(s.hasNext()){
            
         int n = s.nextInt();

        
    
            if(n>47)
            {
                System.out.println("Number guessed is more than original number");
             
                
            }
            else if(n<47)
            {
                System.out.println("Number guessed is less than original number");
                
            }
            else
            {
                System.out.println("Number guessed matches the original number");
                d= false;
              break;
            }
            
       
    }
}
}

      


