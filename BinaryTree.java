public class BinaryTree {
	Node root;
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	public int getSize() {
			//faz a varredura e retorna a quantidade
			return 1;
	}
	public void printPreOrder() {
		printPreOrder(root);
	}
	public void printPreOrder(Node x) {
		//condição de parada
		if (x == null) 
			return;
		//raiz primeiro, Esquerda, Direita
		System.out.print(x.getData() + " ");
		printPreOrder(x.getLeftNode());
		printPreOrder(x.getRightNode());
	}
	
	public void printInOrder() {
		printInOrder(root);
	}
	public void printInOrder(Node x) {
		//condição de parada
		if (x == null) 
			return;
		//Esquerda, raiz , Direita
		printInOrder(x.getLeftNode());
		System.out.print(x.getData() + " ");
		printInOrder(x.getRightNode());
	}
	
	public void printPostOrder() {
		printPostOrder(root);
	}
	public void printPostOrder(Node x) {
		//condição de parada
		if (x == null) 
			return;
		//Esquerda, Direita, raiz
		printPostOrder(x.getLeftNode());
		printPostOrder(x.getRightNode());
		System.out.print(x.getData() + " ");
	}

	public int getDegree() {
		return 1;
	}

}
