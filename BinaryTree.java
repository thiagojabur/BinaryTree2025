import java.util.Stack;


public class BinaryTree {
	Node root;
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	void iterativePreorder() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + " ");

            if (node.rightNode != null) {
                stack.push(node.rightNode);
                
            }
            if (node.leftNode != null) {
                stack.push(node.leftNode);
                
            }
        }

	}
	
	int height() {
        return height(root);
    }

    int height(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = height(node.leftNode);
        int rightHeight = height(node.rightNode);

        return 1 + Math.max(leftHeight, rightHeight);
    }
	
	public int getSize() {
		if (root == null) {
            return 0;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        int size = 0;
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            size = size +1;
           
            if (node.rightNode != null) {
                stack.push(node.rightNode);
            }
            if (node.leftNode != null) {
                stack.push(node.leftNode);
            }
        }
		return size;	
	}
	public void printPreOrder() {
		printPreOrder(root);
	}
	
	public boolean deleteExternalNode(Node toDelete) {
		if (toDelete.isInternal())
			return false;
		
		if (toDelete == root) {
			root = null;
			return true;
		}

		if (toDelete.dadNode.leftNode == toDelete) { 
			//é um filho esquerdo
			toDelete.dadNode.leftNode = null;
		} else 
			toDelete.dadNode.rightNode = null;

		return true;
		
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

	
    public boolean isBalanced() {
        return isBalancedHelper(root) != Integer.MIN_VALUE;
    }

    private int isBalancedHelper(Node node) {
        if (node == null) {
            return 0;
        }

        // Calcula a altura das subárvores esquerda e direita
        int leftHeight = isBalancedHelper(node.leftNode);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE; // Subárvore esquerda não balanceada
        }

        int rightHeight = isBalancedHelper(node.rightNode);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE; // Subárvore direita não balanceada
        }

        // Verifica se a diferença de altura é maior que 1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return Integer.MIN_VALUE; // Árvore não balanceada
        }

        // Retorna a altura da árvore para o nó atual
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
