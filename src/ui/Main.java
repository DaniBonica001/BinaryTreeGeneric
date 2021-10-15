package ui;

import model.BinaryTree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.createNode(70);
		tree.createNode(66);
		tree.createNode(95);
		tree.createNode(30);
		tree.createNode(67);
		tree.createNode(68);
		tree.createNode(80);
		tree.createNode(96);
				
		System.out.println("Recorrer en pre-orden: Estado inicial");
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		System.out.println("Eliminar nodo con valor 68");
		tree.deleteNode(tree.getRoot(),68);
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		System.out.println("Eliminar nodo con valor 66");
		tree.deleteNode(tree.getRoot(),66);
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		System.out.println("Obtener valor de un nodo: "+tree.getTreeNode(tree.getRoot(), 80).getValue());
		
		System.out.println("__________________");		
		System.out.println("�Est� vac�o el �rbol?: "+tree.isEmpty());
		
		System.out.println("__________________");		
		System.out.println("�El nodo con valor 80 es una hoja?: "+tree.isLeaf(tree.getTreeNode(tree.getRoot(), 80)));
		


	}

}
