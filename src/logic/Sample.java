package logic;

public class Sample {
	int data;
	Sample left,right;
	public Sample(int newdata) {
		this.data=newdata;
		}

	public static void main(String[] args) {
		Sample pa = new Sample(5);
		pa.left=new Sample(3);
		pa.right=new Sample(6);
		pa.left.left=new Sample(1);
		pa.left.right=new Sample(2);
		pa.right.left=new Sample(8);
		pa.right.right=new Sample(10);

		int key = 3;
		 
	       
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
 
        key = 10;
 
      
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
    }

		
		

	}

}
