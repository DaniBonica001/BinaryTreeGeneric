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
				
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		tree.deleteNode(tree.getRoot(),68);
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		tree.deleteNode(tree.getRoot(),66);
		tree.recorrerPreorden(tree.getRoot());
		
		System.out.println("__________________");
		System.out.println("Get value of a node: "+tree.getTreeNode(tree.getRoot(), 80).getValue());


	}

}
