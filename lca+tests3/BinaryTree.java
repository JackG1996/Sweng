import java.util.NoSuchElementException;

public class BinaryTree<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {

		private Key key; // sorted by key
		private Value val; // associated data
		private Node left, right; // left and right subtrees
		private int N; // number of nodes in subtree

		public Node(Key key, Value val, int N) {

			this.key = key;
			this.val = val;
			this.N = N;
		}
	}
<<<<<<< HEAD
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node x) {
		if (x == null) {
			return 0;
		} else {
			return x.N;
		}
	}
	
=======

>>>>>>> assignment#1
	public boolean contains(Key key) {
	
		return get(key) != null;
	}

	  public Value get(Key key) { return get(root, key); }

	    private Value get(Node x, Key key) {
	        if (x == null) return null;
	        int cmp = key.compareTo(x.key);
	        if      (cmp < 0) return get(x.left, key);
	        else if (cmp > 0) return get(x.right, key);
	        else              return x.val;
	    }
	    
	public void put(Key key, Value val) {
		
<<<<<<< HEAD
		if (val == null || key == null || contains(key)) {
=======
		if (val == null || key == null) {
>>>>>>> assignment#1
			return;

			}

			root = put(root, key, val);
	}

	private Node put(Node x, Key key, Value val) {
		if (x == null)
			return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = put(x.left, key, val);
		else if (cmp > 0)
			x.right = put(x.right, key, val);
<<<<<<< HEAD
		
		x.N = 1 + size(x.left) + size(x.right);
		return x;
	}
	
	  public String printKeysInOrder() {
			if(isEmpty()) 
			{ 
				return "()";
			}
			else
			{
				return printKeysInOrderPrivate(root);
			}

		}
		private String printKeysInOrderPrivate(Node theNode)
		{
			String result = "";
			if(theNode == null)
			{
				return "()";
			}
			else
			{
				result += "(";
				result += printKeysInOrderPrivate(theNode.left);
				result += theNode.key;
				result += printKeysInOrderPrivate(theNode.right);
				result += ")";
				return result;
			}
		}
=======

		return x;
	}
>>>>>>> assignment#1

	public String lca(Key x1, Key x2) {
		
		if (root == null) {
			return null;
		}
		if(x1 == x2 )
		{
			return null;
		}
		if (!(contains(x1) && contains(x2))) {
			return null;
		}
		
		return lca(root, x1, x2);
	}

	private String lca(Node node, Key x1, Key x2) {
		
	
		if (x1.compareTo(node.key) < 0 && x2.compareTo(node.key) < 0) {
			node = node.left;
			return lca(node, x1, x2);
		} else if (x1.compareTo(node.key) > 0 && x2.compareTo(node.key) > 0) {
			node = node.right;
			return lca(node, x1, x2);
		}

		return String.valueOf(node.key);
	}
	
}