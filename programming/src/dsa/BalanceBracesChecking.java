package dsa;
public class BalanceBracesChecking {
static char[] stack;
static int top=-1;
	public static void main(String[] args) {
		String s="()()()(())";
		stack=new char[s.length()];
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(')
			{
//				push('(');
			}
			else if(ch==')'&& top== -1)
			{
				flag=false;break;
			}
			else {
				{
//					Pop();
				}
			}
			if(top==-1&&flag==true) {
				System.out.println("balanced....");
			}
			else {
				System.out.println("unbalance");
			}
		}
		
	}
}
