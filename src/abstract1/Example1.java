package abstract1;

abstract class Example1 {
	
		  public abstract void animalSound();
	
		  public void sleep() {
		    System.out.println("Zzz");
		  }
		}

	
		class Pig extends Example1 {
		  public void animalSound() {
		    
		    System.out.println("The pig says: wee wee");
		  }
		}
