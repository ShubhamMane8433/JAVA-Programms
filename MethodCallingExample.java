class MethodCallingExample
{
	
	public static void main(String[] args)
	{
		System.out.println("Main method started!!!");
		m1();
		System.out.println("Main method ended!!!");
	}

	public static void m1()
	{
		System.out.println("m1 method started!!!");
		m2();
		System.out.println("m1 method ended!!!");
	}
	
	public static void m2()
	{
		System.out.println("m2 method started!!!");
		m3();
		System.out.println("m2 method ended!!!");
	}
	
	public static void m3()
	{
		System.out.println("m3 method started!!!");
		System.out.println("m3 method ended!!!");
	}
	


}