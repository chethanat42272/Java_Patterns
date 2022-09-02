package java_patterns;

public class BillPaugh 
{
private   BillPaugh() {}

private static class Singletonholder
{
	private static BillPaugh instance=new BillPaugh();
	
}
public static BillPaugh getInstance()
{
	return Singletonholder.instance;
}
public void run()
{
	System.out.println("Running");
}
}
