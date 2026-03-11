package dsa;


public class DoublyLinkedListImp {
	Node1 head;
	Node1 tail;
	

	void insert( int ele) {
		Node1 n=new Node1(ele);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
		}
		System.out.println(ele+"had been Inserted");
	}
	
	void display() {
		System.out.println("======Linked List-Data========");
		if(head==null) {
			System.out.println("Linked list is empty..");
		}
		else {
			Node1 temp=head; 
			while(temp.next!=null)
			{
				System.out.println(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	void displayRev() {
		System.out.println("============Data========");
		if(head==null) {
			System.err.println("Linked list is empty..");
		}
		else {
			Node1 temp=tail;
			while(temp.prev!=null)
			{
				System.out.println(temp.data+"->");
				temp=temp.prev;
			}
			System.out.println(temp.data);
		}
	}
	
	void insertfront(int ele) {
		Node1 n=new Node1(ele);
		if(head==null) {
			head=n;
			tail=n;}
		else {
			n.next=head; 
			head.prev=n;
			head=n;}
		
	}
	void deletefront() {

		if(head==null)
			System.out.println("list is empty");
		else {
			System.out.println(head.data+" had been deleted");
			head=head.next;
			head.prev=null;
		}
	}

	
} 
  