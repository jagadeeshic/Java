class One
{
	final int VAR=20;
	static int A;
	static	void hello()
		{
			System.out.println("Hello");
		}


}
class Two
{
	public static void main(String[] args)
	{
	    var h = new One();
	    One.hello();
	    h.hello();
	    System.out.println(h.VAR);
	}
}
