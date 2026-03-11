package dsa;
import java.util.Scanner;
public class QueueOperation {
	
	static int fromt,rear;
	static int[] queue;
//Queue operation
//->createQueue()
//->enqueue()
//->dequeue()
//->display()
//->isEmpty()
//->isFull()
//->clear()
	static void createQueue(int size) {
		queue=new int[size];
		System.out.println("Queue had beeen created with size:"+size);
	}
	static void enqueue(int ele) {
		if(rear==queue.length)
			System.out.println("queue is full");
		else {
			queue[rear]=ele;
			rear++;
			System.out.println(ele+" had been added in the queue");
		}
	}
	static void display() {
		System.out.println("====queue Dta===");
		if(rear==fromt) {
			System.out.println("queue is empty");
		}
		else {
			for(int i=fromt;i<rear;i++) {
				System.out.println(queue[i]+" ");
			}
			System.err.println();
		}
		System.out.println("==================================================");
	}
	static void dequeue(){
		if(rear==fromt)
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println(queue[fromt]+" had been deleted..!");
			for(int i=fromt;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			rear--;
		}
	}
	static boolean isEmpty() {
		return rear==fromt;
	}
	static boolean isFull() {
		return rear==queue.length;
	}
	static void clear() {
		rear=0;
		System.out.println("queue had cleared");
	}
	public static void main(String[] args) {
		System.out.println("======welcome to Queue DataStructure");
		Scanner ipScanner=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=ipScanner.nextInt();
		createQueue(size);
		while(true) {
			System.out.println("operation");
			System.out.println("1.Enqueue\n2.Dequeu\n3.Display\n4.clear\n5.isEmpty\n6.isFull");
			System.out.println("enter option->");
			int op=ipScanner.nextInt();
			 switch(op) {
			 case 1:System.out.println("enter the data to insert");
			 int ele=ipScanner.nextInt();
			 enqueue(ele);break;
			 case 2:System.out.println("enter the data to delete");
			 int ele1=ipScanner.nextInt();
			 dequeue();
			 break;
			 case 3:display();
			 case 4:System.out.println("queue is to be clear");
			 clear();
			 break;
			 case 5:System.out.println("queue is empty");
			 isEmpty();
			 break;
			 case 6:System.out.println("need to be implemented");
			 break;
			 case 7:System.out.println("Thank you......!!");
			 		System.exit(0);
			 default :System.out.println("invalid option");
			 
			 
			 } 
		}
		
		
		
		
	}

}
