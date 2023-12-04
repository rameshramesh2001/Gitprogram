package linearsearch;

public class LinearsearchExample {
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 90;    
        LinearSearch  pa = new  LinearSearch ();
       // pa.linearsearch(a1, key);
        System.out.println(key+" is found at index: "+pa.linearsearch(a1, key));    
    }

}

