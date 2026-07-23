import java.util.ArrayList;
import java.util.List;

public class binaryTreePreorderTraversal {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function for Preorder Traversal
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    // Recursive helper function
    private static void preorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Visit Root
        result.add(root.val);

        // Visit Left Subtree
        preorder(root.left, result);

        // Visit Right Subtree
        preorder(root.right, result);
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

        System.out.println(preorderTraversal(root));
    }
}