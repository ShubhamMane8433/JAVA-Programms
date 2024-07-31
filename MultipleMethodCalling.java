class MultipleMethodCalling
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...!!!");
		
		m1();
		
		System.out.println("Main method Ended...!!!");
	}
	
	public static void m1()
	{
		System.out.println("M1 method started....!!!");
		
		m2();
		
		System.out.println("M1 method Ended....!!!");
		
		
	}
	public static void m2()
	{
		System.out.println("M2 method started....!!!");
		
		m3();
		
		System.out.println("M2 method Ended....!!!");
		
	}
	public static void m3()
	{
		System.out.println("M3 method started....!!!");
		
		
		
		System.out.println("M3 method Ended....!!!");
		
	}
	
	
}