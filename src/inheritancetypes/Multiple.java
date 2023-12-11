package inheritancetypes;

interface Multiple {
	public void print_my();

	public static void main(String[] args) {
		Multiple2 ob = new Multiple2();
		ob.print_my();
		ob.print_name();
		ob.print_three();

	}

}
