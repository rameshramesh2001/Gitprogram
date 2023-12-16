package sorts;

import java.util.Arrays;

public class InsertionMain {

	public static void main(String[] args) {
     int[] arr = {50,6,80,51,3,1,90};
     Insertion.insertionsort(arr);
     System.out.println(Arrays.toString(arr));
	}

}
