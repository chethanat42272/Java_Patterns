package java_patterns;

import java.util.Objects;

public class LazyInitialization_Thread_safe 
{
	private static LazyInitialization_Thread_safe instance=null;
	
	private LazyInitialization_Thread_safe() {}

	public static LazyInitialization_Thread_safe getInstance()
	{
		if(Objects.isNull(instance))
		{
			synchronized (LazyInitialization_Thread_safe.class) 
			{
				instance=new LazyInitialization_Thread_safe();	
			}

		}
		return instance;
	}
	public void say_bye()
	{
		System.out.println("Bye");
	}
}
