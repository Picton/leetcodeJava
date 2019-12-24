package tree;

 
public class Solution{
     public static void main(String[] args) {
          TreeNode rootNode  = new TreeNode(1);
          
         TreeNode lefttwo = new TreeNode(2);
         lefttwo.left=(new TreeNode(4));
         
         TreeNode righttwo = new TreeNode(3);
         righttwo.left=(new TreeNode(5));
         
         
         rootNode.left=(lefttwo);
         rootNode.right=(righttwo); 
        System.out.println(" run(rootNode)"+ run(rootNode));
          

     }
    public static int run(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = run(node.left);
        System.out.println("left " +left+" val " +node.val);

       
        int right = run(node.right);
        System.out.println("right" + right+" val " +node.val);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
    public static int run1(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = run(node.left);
        System.out.println("left " +left+" val " +node.val);

       
        int right = run(node.right);
        System.out.println("right" + right+" val " +node.val);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}