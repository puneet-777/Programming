package dsa;

public class MainForDoubly {

	public static void main(String[] args) {

		
		DoublyLinkedListImp d1=new DoublyLinkedListImp();
		d1.insert(12);
		d1.insert(24);
		d1.insert(36);
		d1.insert(48);
		d1.insert(60);
		d1.insert(72);
		d1.insert(84);
		d1.display();
		d1.displayRev();
		d1.insertfront(11);
		d1.display();
		d1.deletefront();
	}

}
