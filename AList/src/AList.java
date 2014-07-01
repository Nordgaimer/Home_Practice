import java.util.ArrayList;

public class AList 
{
	private int [] array = new int [100];
	int index=0;

	public void addEnd (int value) 
	{
		array[index]=value;
		index++;
	}
	public void addStart (int value) 
	{
		for (int i=index;i>0;i--)
		{
			array[i]=array[i-1];
		}
		array[0]=value;
		index++;
	}
	public void set_pos (int value, int pos)
	{
		if (array.length==0 || pos>index)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			array[pos]=value;
		}

	}
	public int size()
	{		
		return index;
	}
	public int min_value ()
	{
		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int min=array[0];
			for (int i=0;i<index;i++)
			{
				if (min>array[i]) min=array[i];
			}
			return min;
		}
	}
	public  int max_value ()
	{

		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int  max=array[0];
			for (int i=0;i<array.length;i++)
			{
				if ( max<array[i])
				{
					max=array[i];
				}
			}
			return max;
		}

	}
	public  int get_value (int pos)
	{

		if (array.length==0 || pos>index-1)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int  get_value = array[pos];
			return get_value;
		}
	}	
	public int [] reverse ()
	{
		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else 	
		{
			int [] temp = new int [index];
			for (int i=0;i<index;i++)
			{
				temp[i]=array[index-i-1];
			}
			for (int i=0;i<index;i++)
			{
				array[i]=temp[i];
			}
			return array;
		}
	}
	public int min_value_index ()
	{
		int min_index=0;
		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int min=array[0];
			for (int i=0;i<index;i++)
			{
				if (min>array[i]) 
				{
					min=array[i];
					min_index=i;
				}
			}
			return min_index;
		}
	}
	public  int max_value_index ()
	{
		int max_index=0;
		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int max=array[0];
			for (int i=0;i<index;i++)
			{
				if (max<array[i]) 
				{
					max=array[i];
					max_index=i;
				}
			}
			return max_index;
		}
	}	
	public  int[] sort ()
	{
		if (index==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				for(int j=i+1;j<index;j++)
				{
					if(array[i]>array[j])
					{
						int tmp=array[i];
						array[i]=array[j];
						array[j]=tmp;
					}
				}
			}
			return array;
		}
	}

	public  void init (int [] array)
	{

		for (int i=0;i<array.length;i++)
		{
			this.array[i]=array[i];
		}
		index=array.length;
	}

	public int [] toArray()
	{
		int [] tmp = new int [index];

		for (int i=0;i<index;i++)

		{
			tmp [i]=array[i];
		}
		return tmp;
	}
}





