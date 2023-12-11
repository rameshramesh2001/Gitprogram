package inheritancetypes;

interface Multiple1 {
	public void print_name();

}



interface three extends Multiple,Multiple1{
	public void print_three();
}



class Multiple2 implements three{

	@Override
	public void print_my() {
		System.out.print("My ");
		
	}

	@Override
	public void print_name() {
		System.out.print("Name is ");
		
	}

	@Override
	public void print_three() {
		System.out.print("Ramesh");
		
	}
	
	
}
