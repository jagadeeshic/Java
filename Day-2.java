class Day2Part1
{

	int hello()
	{ int fin;
	
	int arr[]={1,2,3,4,5,6,8,9,9,6,5,8,5,5,55,5,5,5,75,8,56,7,5,58,6,8,2,5,5};
	fin=hi(arr);
	return fin;
	}
	
	int hi(int[] arr1)
	{
	int sum=0;
	int c=0;
	 for(int i: arr1)
	 {
		
		sum+=i;
		System.out.println("THis is "+sum+"count    ----->   "+c);
		c+=1;
	 }
	 return sum;
	}
	
	
}

class Day2Part3
{
	int var_one=0;
	
	Day2Part3()
	{
		var_one=20;
	}
}

class Day2Part4
{
  int var_two=0;
  
	Day2Part4()
	{
		var_two=-1;
	}
	
	Day2Part4(int var_two)
	{
	  System.out.println(var_two);
	  ++var_two;
	  System.out.println(var_two);
	  System.out.println(this.var_two);
     }

}


class Day2Part2
{
  
  public static void main(String[] args)
	{
		int m,k,a=10;
																																	
		switch(a)
		{
			case 1: System.out.println("hello=1");
			break;
			case 2: System.out.println("hello=2");
			break;
			case 3: System.out.println("hello=3");
			break;
			case 4: System.out.println("hello=4");
			break;
			case 5: System.out.println("hello=5");
			break;
			default: System.out.println("Hello default");
			break;
			
		}
		
	    // OBJECTS DECLARATIONS
		Day2Part1 obj = new Day2Part1();
		k=obj.hello();
		System.out.println("hello sum"+k);
		
		var obj1 = new Day2Part3();
		System.out.println(obj1.var_one);
		
		var obj2= new Day2Part4(5);
		
		System.out.println("<==========Hello===============>");
		m=-12;
		
		for(int i=0;i<10;i++)
		{
			System.out.println(m+=1);
		}

	}
  

}
