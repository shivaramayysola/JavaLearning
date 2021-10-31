class A {
   static void m1(){
       System.out.println("A M1");
   }
   static void m2()
   {
     System.out.println("A M2");
	 
   }
   static void m3()
   {
      System.out.println("A M3");
   }
   
}
class B{
        static void m4()
		{
		        System.out.println("B M4");
		}
}
class C{
    public static void main(String[] args)
	{
	System.out.println("C Main");
				A.m1();
				A.m2();
				A.m3();
				B.m4();
	}
}