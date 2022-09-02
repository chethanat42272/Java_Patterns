package java_patterns;

import java.util.Objects;

public class DoubleCheck
{
private static DoubleCheck instance;
private DoubleCheck() {}

public static DoubleCheck getInstance()
{
	if(Objects.isNull(instance))
	{
		synchronized (DoubleCheck.class)
		{
			if(Objects.isNull(instance))
			{
				instance=new DoubleCheck();
			}
		}
	}
	return instance;
}
public void say_smthng()
{
	System.out.println("hi");
}
}
