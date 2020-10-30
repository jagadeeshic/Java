class ObjectRef
{
	int var_1;
	int var;
	ObjectRef()
	{
		var=0;
		var_1=10;
	}
	
	void method2(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void meth1(ObjectRef onj)
	{
		onj.var_1=200;
		System.out.println(onj.var_1);
	}
	
}

class ObjectRef2
{
	public static void main(String[] args)
	{
		var object_1 = new ObjectRef();
		var object_2 = new ObjectRef();
		var object_3 = new ObjectRef();
		
		object_3=object_1;
		
		object_1.method2(2,5);
		object_1.meth1(object_1);
		object_2.meth1(object_2);
		
		object_3.var_1=2496;
		
		System.out.println("===Hello--> 1");
		System.out.println(object_2.var_1);
		System.out.println("===Hello--> 2");
		System.out.println(object_1.var_1);
		System.out.println("===Hello--> 3");
		System.out.println(object_3.var_1);
		
		System.out.println(object_1.hashCode());
		System.out.println(object_2.hashCode());
		System.out.println(object_3.hashCode());
		System.out.println(object_1.toString());
		System.out.println(object_2.toString());
		
		System.out.println("===Hello--> COMMAND LINE ARGS------->");
		
		
	}
}

