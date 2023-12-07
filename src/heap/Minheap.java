package heap;

public class Minheap {
	int data;
	Minheap left,right;
	public Minheap(int newdata) {
		this.data=newdata;
	}
	public int getData() {
		return data;
	}
	public Minheap getLeft() {
		return left;
	}
	public Minheap getRight() {
		return right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(Minheap left) {
		this.left = left;
	}
	public void setRight(Minheap right) {
		this.right = right;
	}

}
