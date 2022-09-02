package java_patterns;

public class EagerInitialization 
{
	private static EagerInitialization intstance=new EagerInitialization();
private EagerInitialization() {}

public static EagerInitialization getInstance()
{
	return  intstance;
	
}
public void sayhello()
{
	System.out.println("Hi hello");
}
}
