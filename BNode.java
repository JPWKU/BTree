// this is implementation of Node class for Balanced tree.

public class BNode
{
	static int t;  //variable to determine order of tree

	int count; // number of keys in node

	int key[];  // array of key values

	BNode child[]; //array of references

	boolean leaf; //is node a leaf or not

	BNode parent;  //parent of current node.

// ----------------------------------------------------
// this will be default constructor for new node      |
// ----------------------------------------------------

	public BNode()
	{}
// ----------------------------------------------------
// initial value constructor for new node             |
// will be called from BTree.java                     |
// ----------------------------------------------------

	public BNode(int t, BNode parent)
	{
		this.t = t;  //assign size

		this.parent = parent; //assign parent

		key = new int[2*t - 1];  // array of proper size

		child = new BNode[2*t]; // array of refs proper size

		leaf = true; // everynode is leaf at first;

		count = 0; //until we add keys later.
	}

// -----------------------------------------------------
// this is method to return key value at index position|
// -----------------------------------------------------

	public int getValue(int index)
	{
		return key[index];
	}

// ----------------------------------------------------
// this is method to get ith child of node            |
// ----------------------------------------------------

	public BNode getChild(int index)
	{
		return child[index];
	}


}



























