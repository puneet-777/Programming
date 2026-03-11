package dsa;

public class LinkedListImpl {

	Node head;
	
	void insert(int ele) {
		Node n=new Node(ele);
		if(head==null){
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(ele+" had been added in the linkedlist");
	}
	
	void display() {
		System.out.println("=========LinkedList Data========");
		if(head == null) 
		{
		System.out.println("Linked list is empty..");	
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.println(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		} 
	}
	void delete() {
		if(head == null)
		{
			System.out.println();
		}
		else if(head.next==null) {
			System.out.println(head.data+" had been deleted");
			head=null;

		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			System.out.println(temp.next.data+" had been deleted");
			temp.next=null;
		}

		
	}
	void insertfront(int ele) {
		Node n=new Node(ele);
		if(head==null)
			head=n;
		else {
			n.next=head;
			head=n;
		}
	}
	void deletefront(int ele) {

		if(head==null)
			System.out.println("list is empty");
		else {
			head=head.next;
		}
	}

	

}
