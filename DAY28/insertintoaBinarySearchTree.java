public class insertintoaBinarySearchTree {

    // Definition for a Binary Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to insert a value into BST
    public static TreeNode insertIntoBST(TreeNode root, int val) {

        // If tree is empty, create a new node
        if (root == null) {
            return new TreeNode(val);
        }

        // Insert into left subtree
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        // Insert into right subtree
        else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    public static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 4
               /   \
              2     7
             / \
            1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 5;

        root = insertIntoBST(root, val);

        System.out.println("BST after insertion:");
        inorder(root);
    }
}