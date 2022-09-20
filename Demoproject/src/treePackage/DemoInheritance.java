package treePackage;

public class DemoInheritance {

	public static void main(String[] args) {
		
		System.out.println("this is begining");
		Five f1=new five();
		f1.bangalore();
		f1.chennai();
		f1.mumbai();
		f1.pune();
		f1.delhi();
		six s1=new six();
		s1.mumbai();
		s1.pune();
		s1.delhi();
		seven s2=new seven();
		s2.delhi();

	}

	class Five{
		public void bangalore() {
			System.out.println("This is bangalore");
		}
		
		public void chennai() {
			System.out.println("This is chennai");
			
		}
	}
	
	
	
	
	
	
	class six{
		public void mumbai() {
			System.out.println("This is Mumbai");
		}
		public void chennai() {
			System.out.println("This is chennai");
		
			
		}			
			
	}
}