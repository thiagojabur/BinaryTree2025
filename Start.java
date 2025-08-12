
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node(2);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);	
		
		Node um = new Node(1);
		Node cinco = new Node(5);
		Node oito = new Node(8);
		raiz.addLeftChild(um);
		raiz.addRightChild(cinco);		
		cinco.addRightChild(oito);
		Node tres = new Node(3);
		cinco.addLeftChild(tres);
		oito.addRightChild(new Node(20));
		
		System.out.println("Pré ordem");
		arvoreExemplo.printPreOrder();
		System.out.println("");
		System.out.println("Em ordem");
		arvoreExemplo.printInOrder();
		System.out.println("");
		System.out.println("Pós ordem");
		arvoreExemplo.printPostOrder();
		
		System.out.println("\nNúmero de nós da árvore: " + arvoreExemplo.getSize());
		
		System.out.println("\nAltura da árvore: " + arvoreExemplo.height()); 
		System.out.println("\nÉ balanceada: " + arvoreExemplo.isBalanced());

		
	}
}
