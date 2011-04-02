package q5515769;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words
{   
    public static List<String> segment(String input)
    {
        if (input.isEmpty() || input.length() == 1)
        {
            return Arrays.asList(input); // return a 1-element list
        }
        
        String first = input.substring(0,1);
        String rest = input.substring(1);
        
        List<String> toReturn = new ArrayList<String>();

        for (String s : segment(rest)) // recursive step
        {
            toReturn.add(first + " " + s);
            toReturn.add(first + s);
        }
        
        return toReturn;
    }
    
    
    public static void main(String[] args)
    {
        System.out.println(segment("abcd"));
    }
}