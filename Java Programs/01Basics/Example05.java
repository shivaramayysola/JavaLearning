class A1{
		void m1()
		{
			System.out.println("A1 non-static m1");
		}
		void m2()
		{
				System.out.println("A1 non-static m2");
		}
}
class B1{
		void m1(){
				System.out.println("B1 non-static m1");
		}
}
class C1{
		public static void main(String[] args){
			A1 a = new A1();
			a.m1();
			B1 b  = new B1();
			b.m1();
		}
}