package q5982096;

public class TimingTest
{
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String str1 = "asdfavaxzvzxvc";
        String str2 = "werwerzsfaasdf";
        Object c = str1;
        Object d = str2;
        System.out.println(c);
        long time1 = System.nanoTime();
        for (int i = 0; i < 1000000000; i++)
        {
            if (c.equals(d))
            {
                // System.out.println("asfasdfasdf"); // line 9
            }
        }
        long time2 = System.nanoTime();
        System.out.println("time taken in this is " + (time2 - time1)/1000000);
    }
}