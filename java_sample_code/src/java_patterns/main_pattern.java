package java_patterns;

public class main_pattern 
{
public static void main(String[] args) {
	

	// TODO Auto-generated constructor stub
	EagerInitialization.getInstance().sayhello();
	LazyInitialization_not_Threadsafe.getInstance().say_wish();
	LazyInitialization_Thread_safe.getInstance().say_bye();
	DoubleCheck.getInstance().say_smthng();
	BillPaugh.getInstance().run();
}
}
