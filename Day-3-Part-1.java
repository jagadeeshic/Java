class OverLoad
{
	int v1;
	
	OverLoad()
	{
		v1=10;
	}
	
	void fun1()
	{
	 System.out.println("======>FUNCTION---->1 ");
	}
	
	void fun1(int a, int b, int c)
	{
	System.out.println(" ======>FUNCTION---->4");
	}
	
	int fun1(int a, int b)
	{
	System.out.println(" ======>FUNCTION---->5");
	return 1;
	}
	
	
	void fun1(int a, float b)
	{
	System.out.println(" ======>FUNCTION---->7");
	}
	
	
	
	
	
}

class Exec
{
	public static void main(String[] args)
	{
		
		var one = new OverLoad();
		one.fun1();
		one.fun1(1,2);
		System.out.println(one.fun1(2,2));
		one.fun1();
		one.fun1();
		one.fun1();
		one.fun1();
		one.fun1();
		one.fun1();
	}
	
}
