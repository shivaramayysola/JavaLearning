class A1{
		static void A1m1()
		{
			System.out.println("A1 m1");
		}
		static void m2()
		{
			System.out.println("A1 m2");
		}
}
class A2{
		static void A2m1()
		{
				System.out.println("A2 m2");
		}
}
class A3{
		void m1(){
			System.out.println("A3 m1");
		}
}
class A4{
	void m1(){
			System.out.println("A4 m1");
	}
}
class A5{
	public static void main(String[] args){
		System.out.println("System A5 main");
		A1.A1m1();
		A2.A2m1();
		A3 a = new A3();
		a.m1();
		
	}
	
	
}