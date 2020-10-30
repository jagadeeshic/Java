class TestArray
{
	public static void main(String[] args)
	{
		int temp,j;
		int[] original_Array={2,4,8,5,12,15,6,10,7,30,25,45};
		for(int i: original_Array)
		{
			if(i%5==0)
			{
				temp=original_Array[i];
				for(j=i;j<(original_Array.length-1);j++)
				{
					original_Array[j] = original_Array[j+1];
				}
				original_Array[j]=temp;
			}
		}
		
		for(int k : original_Array)
		{
			System.out.println(k);
		}
		
	}
}
