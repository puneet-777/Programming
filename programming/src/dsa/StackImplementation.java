package dsa;

public class StackImplementation {

//	pop()--->which will delete top element
//	/display()-->top to bottom approach
//	isEmpty()
//	ifFull()

	static int[] stack;
	static int top;

	static void createStack(int size) {
		stack = new int[size];
		top = -1;
		System.out.println("stack had been created with size=" + size);
	}

	static void push(int ele) {
		if (top == stack.length - 1) {
			System.out.println("stack overflow......");
		} else {
			{
				top++;
				stack[top] = ele;
				System.out.println(ele + "  had been inserted in stack...");
			}
		}
	}

	static void display() {
		System.out.println("========Stack Data=========");
		if (top == -1) {
			System.out.println("Stack is Empty....");
		} else {
			{
				for (int i = top; i >= 0; i--) {
					System.out.println(stack[i]);
				}
			}

		}
		System.out.println("========================");
	}

	public static void pop() {
		if (top == -1) {
			System.out.println("Stack underflow..");
		} else {
			System.out.println(stack[top] + " had been deleted.");
			top--;
		}

	}

	static boolean isEmpty() {
		return top == -1; 
	}

	static boolean isFull() {
		return top == stack.length - 1;
	}

	public static void main(String[] args) {
		createStack(5);
		push(5);
		push(10);
		push(15);
		push(20);
		push(25);
		display();
		pop();
		pop();
		display();

	}

}
