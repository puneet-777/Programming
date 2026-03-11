package dsa;
import java.util.Stack;

		public class BalancedBracesChecker {

		    public static boolean isBalanced(String expression) {
		        Stack<Character> stack = new Stack<>();

		        for (char ch : expression.toCharArray()) {
		            // Push opening braces
		            if (ch == '(' || ch == '{' || ch == '[') {
		                stack.push(ch); 
		            }
		            // Check closing braces
		            else if (ch == ')' || ch == '}' || ch == ']') {
		                if (stack.isEmpty()) return false;

		                char top = stack.pop(); 
		                if (!matches(top, ch)) return false;
		            }
		        }

		        // If stack is empty, all braces matched
		        return stack.isEmpty();
		    }

		     static boolean matches(char open, char close) {
		        return (open == '(' && close == ')'); 
//		                (open == '{' && close == '}') ||
//		               (open == '[' && close == ']'); 
		    }

		    public static void main(String[] args) {
		        String input = "((((((())"; // Try changing this to test other cases
		        if (isBalanced(input)) {
		            System.out.println("Braces are balanced.");
		        } else {
		            System.out.println("Braces are NOT balanced.");
		        }
		    }
		}

