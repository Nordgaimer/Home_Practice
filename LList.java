



public class LList
{
	class Node
	{
		int data;
		Node next;
		public Node( int val )
		{
			this.data = val;
		}
	}
	
	Node root = null;

	public int size()
	{
		int count = 0;
		Node tmp = root;
		while(tmp!=null)
		{
			count++;
			tmp = tmp.next;
		}
		return count;
	}

	@Override
	public String toString()
	{
		Node tmp = root;
		String str = "";
		while(tmp!=null)
		{
			str += tmp.data+", ";
			tmp = tmp.next;
		}
		return "LList [root = " + str + "]";
	}

	public void addStart(int val)
	{
		Node tmp = new Node(val);
		tmp.next = root;
		root = tmp;
	}

	public void delStart()
	{
		root = root.next;
	}

	
	public void clear() 
	{
		root = null;		
	}

}

