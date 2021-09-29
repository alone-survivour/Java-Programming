package com.basic.patterns;

class Node4
{
    int key;
    Node4 left, right;

    public Node4(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree3
{
  // Root of Binary Tree
    Node4 root;

    BinaryTree3()
    {
        root = null;
    }

  // Print the nodes of binary tree

    void print_Postorder(Node4 node)
    {
        if (node == null)
            return;

        print_Postorder(node.left);

        print_Postorder(node.right);

        System.out.print(node.key + " ");
    }

   // Wrappers over above recursive functions
    void print_Postorder()  
	{   
	   print_Postorder(root);  
	}
        public static void main(String[] args)
    {
       BinaryTree3 tree = new BinaryTree3();
        tree.root = new Node4(55);
        tree.root.left = new Node4(21);
        tree.root.right = new Node4(80);
        tree.root.left.left = new Node4(9);
        tree.root.left.right = new Node4(29);
        tree.root.right.left = new Node4(76);
        tree.root.right.right = new Node4(91);

        System.out.println("\nPostorder traversal of binary tree is: ");
        tree.print_Postorder();
    }
}
