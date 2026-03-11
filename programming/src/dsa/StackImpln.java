package dsa;

public class StackImpln { 

	static int[] stack;
	static int top;
	
	static void createStack(int size) {
		stack =new int[size];
		top=-1;
		System.out.println("stack had been created with size="+size);
	}
	
	static void push(int ele) {
		if(top==stack.length-1)
		{
			System.out.println("stack overflow......");
		}
		else {
			
				top++;
				stack[top]=ele;
				System.out.println(ele+"  had been inserted in stack...");
			
		}
		
	}
	
	static void display() {
		System.out.println("=======================Data=====================");
		if(top==-1)
		{
			System.out.println("Stack is empty....");
		}
		else {
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
	static void pop() {
		if(top==-1)
		{
			System.out.println("Stack is underflow..");
		}
		else {
			System.out.println(stack[top]+" had been deleted..");
			top--;
		}
	} 
	public static boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		
		return top==stack.length-1;
		
	}
	public static void main(String[] args) {
		createStack(5);
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(7);
		display();
		pop();
		display();
		
	}
}
