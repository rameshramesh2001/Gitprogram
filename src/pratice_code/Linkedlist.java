package pratice_code;

public class Linkedlist {
	node head;
class node{
	int data;
    node next;
node(int val){
	data=val;
	next=null;
}
}
 Linkedlist(){
	head=null;
}
public void insertAtBegnning(int val) {
	node newnode = new node(val);
	if(head==null) {
		head=newnode;
	}
	else {
		newnode.next=head;
		head=newnode;
	}
}
public void display() {
	node temp=head;
	while(temp!=null) {
		
	System.out.print(temp.data+" ");
	temp=temp.next;
}
}
public void insertAtpos(int pos, int val) {
	if(pos==0) {
		insertAtBegnning(val);
		return;
	}
	node newnode = new node(val);
	node temp=head;
	for(int i=1;i<pos;i++) {
		temp=temp.next;
	}
	newnode.next=temp.next;
	temp.next=newnode;
}
public void delAtpos(int pos) {
	node temp=head;
	node prev=null;
    for(int i=1;i<=pos;i++) {
    	prev=temp;
    	temp=temp.next;
    }
    prev.next=temp.next;
}

}
