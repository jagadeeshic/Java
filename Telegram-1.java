class ArrayTest
{
	public static void main(String[] args)
	{	
		int counter=0,counter_Start;
		int hello(int counter_1)
		{
			System.out.println(counter_1);
			return counter;
		}
		int[] original_Array={2,4,8,5,12,15,6,10,7,30,25,45};
		for(int i : original_Array )
		{
			if(i%5==0)
			{
			 counter+=1;
			}
			else
			{
				continue;
			}
		}
		counter_Start=((original_Array.length-counter)-1);
		System.out.println(counter_Start);
		System.out.println(hello(counter));
		
		
	}
}
