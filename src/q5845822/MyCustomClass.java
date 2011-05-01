package q5845822;

import java.util.Date;

public class MyCustomClass
{
    Date date;
    Long value;

    public MyCustomClass (Date date, Long value)
    {
        this.date = date;
        this.value = value;
    }
    
    @Override
    public String toString()
    {
    	return "{date: " + date + ", value: " + value + "}";
    }
}