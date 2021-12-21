class Solution {
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int sum = 0;
        Queue<TreeNode> que = new LinkedList();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            int val = node.val;
            if(val >= low && val <= high){
                sum+=val;    
            }
            
            if(node.left != null)
                que.add(node.left);
            if(node.right != null)
                que.add(node.right);
        }
        
        return sum;
    }
    
}