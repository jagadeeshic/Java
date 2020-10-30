class Operations
{
	public static void main(String[] args)
	{
		String one = "Hello";
		String two = "Hello";
		System.out.println(one);
		System.out.println(two);
		String three = new String();
		three="Wlecome to java on UBUNTU 20.04 LTS os";
		System.out.println(three);
		
		System.out.println(three.substring(5));
		for(char c='A'; c<='z';c++)
		{
			System.out.println(three.replace('U',c));
		}
		
	}
}
