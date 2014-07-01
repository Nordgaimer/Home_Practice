
public class LListMain 
{
	public static void main(String[] args) 
	{
		LList aa = new LList();
		aa.addStart(10);
		aa.addStart(30);
		aa.addStart(11);
		aa.addStart(77);
		System.out.println(aa.size());
		System.out.println(aa.toString());
		aa.addStart(101);
		aa.addStart(100);
		System.out.println(aa.toString());
		
	}
}
