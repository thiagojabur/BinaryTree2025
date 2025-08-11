
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node(2);
		Node um = new Node(1);
		Node cinco = new Node(5);
		Node oito = new Node(8);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);	
		raiz.addLeftChild(um);
		raiz.addRightChild(cinco);
		
		cinco.addRightChild(oito);
		cinco.addLeftChild(new Node(3));
		
		System.out.println("Pré ordem");
		arvoreExemplo.printPreOrder();
		System.out.println("");
		System.out.println("Em ordem");
		arvoreExemplo.printInOrder();
		System.out.println("");
		System.out.println("Pós ordem");
		arvoreExemplo.printPostOrder();
	}
}
