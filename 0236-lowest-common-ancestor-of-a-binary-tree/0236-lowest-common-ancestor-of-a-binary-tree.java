
class Solution {
    public boolean exists(TreeNode root, TreeNode node){
        if(node==root) return true;
        if(root==null) return false;
        return exists(root.left, node) || exists(root.right, node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;

        boolean pLiesInLst = exists(root.left, p);
        boolean qLiesInLst = exists(root.left, q);

        if (pLiesInLst==true && qLiesInLst==true) return lowestCommonAncestor(root.left, p, q);
        if (pLiesInLst==false && qLiesInLst==false) return lowestCommonAncestor(root.right, p, q);
        else return root;  // when pliesinlst = true and qliesinlst =false
    }
}
