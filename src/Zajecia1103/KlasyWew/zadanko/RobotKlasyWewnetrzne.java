package Zajecia1103.KlasyWew.zadanko;

public class RobotKlasyWewnetrzne {
	public interface Greetings{
		void sayHello();
	}
	
	public static class Robot {
		private Greetings powitanie;
		
		public Robot(Greetings powitanie) {
			this.powitanie = powitanie;
		}
		
		public void saySomething() {
			powitanie.sayHello();
		}
	}
	
	public static void main(String[] args) {
		Robot jan = new Robot(new Greetings() {
			
			@Override
			public void sayHello() {
				System.out.println("Witam");
			}
		});
		
		Robot john = new Robot(new Greetings() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		});
		
		Robot helga = new Robot(new Greetings() {
			
			@Override
			public void sayHello() {
				System.out.println("Guten tag");
			}
		});
		
		jan.saySomething();
		john.saySomething();
		helga.saySomething();
	}
}
