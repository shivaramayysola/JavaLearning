public class Example{
		void m1(){
			System.out.println("Example m1");
		}
		private int a = 10; // private variable
				int b = 20; // package level variable						
		protected int c = 30; // protected variable
		public int d = 40; // public variable
		
		
}
class Sample{
	public static void main(String[] args){
				Example e = new Example();
				System.out.println("a : "+ e.a);
				System.out.println("b : "+ e.b);
				System.out.println("c : "+ e.c);
				System.out.println("d : "+ e.d);
		}
}
	
