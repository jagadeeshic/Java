class Day3Part1
{

	public static void main(String[] args)
	{
		var obj1 = new Stack();
		obj1.push(2);
		System.out.println(obj1.pop());
		obj1.push(10);
		obj1.arr();
	}


}

class Stack
{
	int stck[]	 =  new int[10];
	int tos;
	
	Stack()
	{
		tos=-1;
	}
	
	void push(int item)
	{
		if(tos==stck.length)
		{
			System.out.println("Over Flow");
		}
		else
		{
			stck[++tos]=item;
		}
	}
	
	int pop()
	{
		if(tos==-1)
		{
			System.out.println("Under Flow");
			return 00;
        }
        else
        {
        	return stck[tos--];
        }
    }
    
    void arr()
    {
    	for(int i=0;i<stck.length;i++)
   		{
    		System.out.println(stck[i]);
    	}
    }
     
}


