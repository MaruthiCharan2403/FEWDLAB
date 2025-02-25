import java.util.*;
class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class q2 {
    public static BinaryTree buildTree(int[] levelorder){
        BinaryTree root = new BinaryTree(levelorder[0]);
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i<levelorder.length){
            BinaryTree node = queue.poll();
            if(i<levelorder.length && levelorder[i]!=-1){
                node.left = new BinaryTree(levelorder[i]);
                queue.offer(node.left);
            }
            i++;
            if(i<levelorder.length && levelorder[i]!=-1){
                node.right = new BinaryTree(levelorder[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
    public static void inorder(BinaryTree root,ArrayList<ArrayList<Integer>> a){
        if(root==null) return;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(root.data);
        inorder(root.left, a);
        a.add(res);
        inorder(root.right, a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] n1 = sc.nextLine().split(" ");
        int[] levelorder = new int[n1.length];
        for(int i = 0;i<n1.length;i++){
            levelorder[i] = Integer.parseInt(n1[i]);
        }
        BinaryTree root = buildTree(levelorder);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        inorder(root,a);
        System.out.println(a);
    }
}
