package dsa;


public class BinarySearchTreeImpl {
	
		void insert(BSTNode root,int  ele)
		{
			if(ele<root.data)
			{
				
				if(root.left==null)
				{
					root.left=new BSTNode(ele);
					System.out.println(ele+" had been inserted towards left of "+root.data); 
				}
				else {
					insert(root.left,ele);
				}
				
				
			}
			else if(ele>root.data)
				{
					if(root.right==null)
					{
						root.right=new BSTNode(ele);
						System.out.println(ele+" had been inserted toward righ of "+root.data);
					}
					else {
						insert(root.right, ele);
					}
				}
				
		}
		 public void preorder(BSTNode root) {
		        if (root != null) {
		            System.out.print(root.data + " ");
		            preorder(root.left);
		            preorder(root.right);
		        }
		    }
		 public void Inorder(BSTNode root) {
		        if (root != null) {
		           
		            preorder(root.left);
		            System.out.print(root.data + " ");
		            preorder(root.right);
		        }
		    }
		 public void Postorder(BSTNode root) {
		        if (root != null) {
		           
		            preorder(root.left);
		            preorder(root.right);
		            System.out.print(root.data + " ");
		        }
		    }
		 


		
		
	}


