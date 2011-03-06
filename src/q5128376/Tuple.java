package q5128376;

import java.util.Arrays;

public class Tuple<T>
{
    private T[] values;
    private int hashCode;
    
    private Tuple(T... values)
    {
        this.values = values;
        this.hashCode = hashCode(values);
    }
    
    public static <T> Tuple<T> create(T... values)
    {
        return new Tuple<T>(values);
    }
    
    private static <T> int hashCode(T... values)
    {
    	return 31 * Arrays.hashCode(values);
    }
    
    @Override
	public int hashCode()
    {
		return hashCode;
	}
    
    @Override
	public boolean equals(Object obj) 
    {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Tuple<?>))
			return false;
		Tuple<?> other = (Tuple<?>) obj;
		if (!Arrays.equals(values, other.values))
			return false;
		return true;
	}
}