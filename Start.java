
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node(2);
		Node quatro = new Node(4);
		Node cinco = new Node(5);
		Node oito = new Node(8);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);
		
		raiz.addChild(quatro);
		raiz.addChild(cinco);
		
		quatro.addChild(oito);
		quatro.addChild(new Node(6));
		
		cinco.addChild(new Node(7));
		
		arvoreExemplo.printPreOrder();
	}
}
