import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function for Inorder Traversal
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        inorder(root, result);

        return result;
    }

    // Recursive helper function
    private static void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Visit Left Subtree
        inorder(root.left, result);

        // Visit Root
        result.add(root.val);

        // Visit Right Subtree
        inorder(root.right, result);
    }

    public static void main(String[] args) {

        /*
                1
                 \
                  2
                 /
                3
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}