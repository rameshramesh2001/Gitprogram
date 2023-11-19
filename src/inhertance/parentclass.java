package inhertance;

import java.util.ArrayList;

public class parentclass{
	public void method() {	
		
	}
	public class childA extends parentclass{
		@override
		public void method() {
			
		}
	}
	public class childB extends parentclass{
		@override
		public void method() {
			
		}
	}
	public class main {
	public static void main(String[] args) {
		ArrayList<parentclass> slist=new ArrayList<>();
		slist.add(new childA());
		slist.add(new childB());
	}
	}
}

