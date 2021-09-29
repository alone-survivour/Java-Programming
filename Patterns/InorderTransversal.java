package com.basic.patterns;
class Node1
{
    int key;
    Node1 left, right;
 
    public Node1(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree2
{
    // Root of Binary Tree
    Node1 root;
 
    BinaryTree2()
    {
        root = null;
    } 
  
    // Print the nodes of binary tree in inorder
    void print_Inorder(Node1 node)
    {
        if (node == null)
            return;
 
        print_Inorder(node.left);
 
     // Print the data of node
        System.out.print(node.key + " ");
 
        print_Inorder(node.right);
    }
 
	void print_Inorder()
	   {     
	     print_Inorder(root);   
	     
	   }
    
    public static void main(String[] args)
    {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node1(55);
        tree.root.left = new Node1(21);
        tree.root.right = new Node1(80);
        tree.root.left.left = new Node1(9);
        tree.root.left.right = new Node1(29);
        tree.root.right.left = new Node1(76);
        tree.root.right.right = new Node1(91);
 
        System.out.println("\nInorder traversal of binary tree is: ");
        tree.print_Inorder(); 
    }
}