package dsa;

public class Runner {

	public static void main(String[] args) {
		
		
		int arr[]= {80,40,23,56,95,86,99,18};
		BinarySearchTreeImpl bst=new BinarySearchTreeImpl();
		BSTNode root=new BSTNode(arr[0]); 
//		bst.insert(root, arr[1]);
//		bst.insert(root, arr[2]);
		
		for(int i=1;i<arr.length;i++)
		{
			bst.insert(root, arr[i]);
		}
		System.out.println("==================Pre-Order==================");
		bst.preorder(root);
		System.out.println();
		
		System.out.println("==================In-Order==================");
		bst.Inorder(root);
		System.out.println();
		
		System.out.println("==================Post-Order==================");
		bst.Postorder(root);
		System.out.println();
		
		
	}

}
