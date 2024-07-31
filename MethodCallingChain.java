class MethodCallingChain

{
	
	public static void main(String[] args)
	
	{
		System.out.println(" Main method started...!!");
          
        MethodCallingChain obj = new MethodCallingChain();
		
		obj.m1();
		  
	    System.out.println(" Main method Ended...!!");
		
	
	}
	
	public void m1()
	
	{
		System.out.println("M1 method started...!!");	
        
		MethodCallingChain obj = new MethodCallingChain();
		obj.m2();
		
		System.out.println("M1 method Ended...!!");
	}
	
	 public static void m2()
	
	{
		System.out.println("M2 method started...!!");
		
		m3();
		
		System.out.println("M2 method Ended...!!");
	}
	
	 public static void m3()
	
	{
       System.out.println("M3 method Started...!!");
	   
	   m2();
	   
	   System.out.println("M3 method Ended...!!");
	}
	
	
}
		