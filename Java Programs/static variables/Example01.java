class Example {
		static int a = m1();
		static int m1(){
				System.out.println("variable 'a' is created");
				return 10;
		}
		static int m2(){
			System.out.println("variable 'b' is created");
			return 20;
		}
		public static void main(Stringp[] args){
				System.out.println("In main");
				System.out.println("a :"+a);
				System.out.println("b : "+b);
		}
		static int b = m2();
		
}