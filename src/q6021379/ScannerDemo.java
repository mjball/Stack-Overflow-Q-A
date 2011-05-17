package q6021379;

import java.util.Scanner;

public class ScannerDemo
{
    private static void convertIntegerToWords(int num)
    {
        String message = null;
        if (num > 9)
        {
            message = "Your integer is too long!";
        }
        else if (num > 0)
        {
            message = "Your integer " + num + " is written out as ";
            String numString = "";
            
            switch (num)
            {
                case 1:
                    numString = "one"; break;
                case 2:
                    numString = "two"; break;
                case 3:
                    numString = "three"; break;
                case 4:
                    numString = "four"; break;
                case 5:
                    numString = "five"; break;
                case 6:
                    numString = "six"; break;
                case 7:
                    numString = "seven"; break;
                case 8:
                    numString = "eight"; break;
                case 9:
                    numString = "nine"; break;
            }
            
            message += numString;
        }
        
        System.out.println(message);
    }
    
    private static int getNextNumber(Scanner s)
    {
        System.out.println("What is your integer?");
        return s.nextInt();
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number;
        while ((number = getNextNumber(input)) >= 0)
        {
            if (number == 0)
            {
                System.out.println("Thank you for playing! Good bye!");
                break;
            }
            
            convertIntegerToWords(number);
        }
    }
}
