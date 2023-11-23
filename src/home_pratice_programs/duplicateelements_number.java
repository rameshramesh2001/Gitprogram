package home_pratice_programs;

public class duplicateelements_number {

	public static void main(String[] args) {
		char arr[]= {'R','A','M','A','R'};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element is: "+arr[i]);
				}
			}
		}

	}

}
