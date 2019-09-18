import java.util.Scanner;

class allfiles
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose any option from 1 to 10");
        System.out.println("1-Palindrome");
        System.out.println("2-oddeven");
        System.out.println("3-vowel or consonant");
        System.out.println("4- loop of numbers");
        System.out.println("5-sum of numbers");
        System.out.println(" 6- Capital or small");
        System.out.println("7- reverse of input");
        System.out.println("8-Guess number");
        System.out.println("9- reverse the string");
       System.err.println(" 10- repetition of number");
        
        
        
       
        int number = s.nextInt();
        switch(number)
        {
            case 1:
            {
                ex1 obj = new ex1();
                obj.palindrome();
                break;
            }
            case 2:
            {
                ex2 obj = new ex2();
                obj.oddeven();
                break;
            }
            case 3:
            {
                ex3 obj = new ex3();
                obj.vowel();
                break;
            }
            case 4:
            {
                ex4 obj = new ex4();
                obj.loop();
                break;
            }
            case 5:
            {
                ex5 obj = new ex5();
                obj.sum1();
                break;
            }
            case 6:
            {
                ex6 obj = new ex6();
                obj.Capital();
                break;
            }
            case 7:
            {
                ex7 obj = new ex7();
                obj.reverse();
                break;
            }
            case 8:
            {
                ex8 obj = new ex8();
                obj.Guess();
                break;
            }
            case 9:
            {
                ex9 obj = new ex9();
                obj.reverse();
                break;
            }
            case 10:
            {
                ex10 obj = new ex10();
                obj.repeat();
                break;
            }

        }

    }
}

