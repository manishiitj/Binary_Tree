
public class Binary_tree {
		Node root;
		
		public Node minimum(){
			Node current,last=root;
			current=root;
			while(current!=null){
				last=current;
				current=current.left_child;
			}
			return last;
		}
		
		public Node maximum(){
			Node current,last=root;
			current=root;
			while(current!=null){
				last=current;
				current=current.right_child;
			}
			return last;
		}
		
		public void insert_node(int key){
			Node new_node=new Node(key);
			if(root==null){
				root=new_node;
			}
			else
			{
				Node current=root;
				Node parent;
				while(true){
					parent=current;
					if(key<current.data){
						current=current.left_child;
						if(current==null){
							parent.left_child=new_node;
							return;
						}
					}
					else{
						current=current.right_child;
						if(current==null){
							parent.right_child=new_node;
							return;
						}
					}
				
				
				}
			}
		}
		
		public Node Delete_Node(int key){
			Node current=root;
			return current;
			
		}
		
		public void InOrder(Node LocalRoot){
			Node current=LocalRoot;
			if(current!=null){
				InOrder(current.left_child);
				System.out.println("The Visited node is "+current.data);
				InOrder(current.right_child);
			}
		}
		
		public Node find_node(int key){
			Node current=root;
			while(current.data!=key){
				if(current.data<key)
					current=current.left_child;
				else
					current=current.right_child;
				if(current==null)
					return null;
				
			}
			return current;
		}
		public static void main(String args[]){
			Binary_tree tree1=new Binary_tree();
			Node root1=new Node(50);
			tree1.root=root1;
			tree1.insert_node(20);
			tree1.insert_node(80);
			tree1.insert_node(70);
			tree1.insert_node(90);
			tree1.insert_node(30);
			tree1.insert_node(25);
			tree1.insert_node(55); 
			tree1.InOrder(tree1.root);
		}
}
