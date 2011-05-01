package q5845822;

import java.lang.reflect.Type;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonTest
{
	public static void main(String[] args)
	{
		String json = "[{\"2011-04-30T00:00:00-0700\":100}, {\"2011-04-29T00:00:00-0700\":200}]";
		
		Gson gson =
			new GsonBuilder()
			.registerTypeAdapter(MyCustomClass.class, new MyCustomDeserializer())
			.create();
		Type collectionType = new TypeToken<Collection<MyCustomClass>>(){}.getType();
		Collection<MyCustomClass> myCustomClasses = gson.fromJson(json, collectionType);
		System.out.println(myCustomClasses);
	}
}