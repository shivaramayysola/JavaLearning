class A{}

class B{
		static void m1(){
		   System.out.println("B M1");
		}
}
class C{
      static void m2(){
	        System.out.println("c M2");
	  }
	  public static void main(String[] args)
	  {
			System.out.println("C Main");
	  }
}
class D{
		static void m3()
		{
		       System.out.println("D m3");
		}
		public static void main(String[] args)
		{
		             System.out.println("D Main");
		}
		static void m4(){
		        System.out.println("D m4");
		}

}
class E{
          static void m5(){
		            System.out.println("E M5");
		  }
		  public static void main(String[] args){
					System.out.println("E main");
					
					m5();
					D.m3();
					C.m2();
					D.m4();
					E.m5();
					D.main(new String[0]);
		  }
}