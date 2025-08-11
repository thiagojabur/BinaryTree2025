
public class Node {
	public int data; 
	Node dadNode;
	
	Node leftNode, rightNode;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}


	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	public Node(int data) {
		this.data = data;
	}
	public Node getDadNode() {
		return dadNode;
	}
	public void setDadNode(Node dadNode) {
		this.dadNode = dadNode;
	}

	public boolean isExternal() {
		if (leftNode==null &&
		rightNode==null)
			return true;
		return false;
	}
	
	
	public boolean isInternal() {
		return !isExternal();
	}

	public String toString() {
		return data + "";
	}
	public void addLeftChild(Node newNode) {
		leftNode = newNode;
	}
	public void addRightChild(Node newNode) {
		rightNode = newNode;
	}
	
	public int getDegree() {
		if (isExternal())
			return 0;
		if (rightNode != null &&leftNode != null)
			return 2;
		else 
			return 1;
	}

}
