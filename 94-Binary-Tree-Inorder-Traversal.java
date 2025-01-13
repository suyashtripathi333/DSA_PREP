/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
       ArrayList<Integer> li = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode temp = root;
       while(!stack.isEmpty() || temp !=null){
        if(temp  != null){
            stack.push(temp);
            temp=temp.left;
        }
        else{
            temp=stack.pop();
            li.add(temp.val);
            temp = temp.right;
        }

        }
    return li;
        
    }

    // List<Integer> ans = new ArrayList<>();

    // public void inorder(TreeNode root){
    //      if(root==null){
    //         return;
    //      }

    //      inorder(root.left);
    //      ans.add(root.val);
    //      inorder(root.right);
    // }
}