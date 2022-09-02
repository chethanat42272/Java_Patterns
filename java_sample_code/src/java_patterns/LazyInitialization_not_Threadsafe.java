package java_patterns;

import java.util.Objects;

public class LazyInitialization_not_Threadsafe
{
	private static LazyInitialization_not_Threadsafe instance=null;
	private LazyInitialization_not_Threadsafe() {}
	public static LazyInitialization_not_Threadsafe getInstance()
	{
		if(Objects.isNull(instance))
		{
			instance=new LazyInitialization_not_Threadsafe();

		}
		return instance;
	}
	public void say_wish()
	{
		System.out.println("Good morning");
	}
}
