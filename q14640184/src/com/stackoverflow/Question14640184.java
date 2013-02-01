package com.stackoverflow;

import java.util.Iterator;

public class Question14640184
{
	public void enhancedForLoop(Iterable<Object> objects1, Iterable<Object> objects2)
	{
		for(Object o1 : objects1)
		{
		    for(Object o2 : objects2)
		    {
		    	// do something
		    }
		}
	}
	
	public void iteratorForLoop(Iterable<Object> objects1, Iterable<Object> objects2)
	{
		for(Iterator<Object> iter1 = objects1.iterator(); iter1.hasNext();)
		{
		    Object o1 = iter1.next();
		    for(Iterator<Object> iter2 = objects2.iterator(); iter2.hasNext();)
		    {
		        Object o2 = iter2.next();
		    }
		}
	}
}