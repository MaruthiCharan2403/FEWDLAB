import java.util.*;

class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class ll {
    public BinaryTree head;
    public BinaryTree current;
}

public class listled {
    // public static BinaryTree head;

    public static BinaryTree buildTree(int[] levelorder) {
        BinaryTree root = new BinaryTree(levelorder[0]);
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < levelorder.length) {
            BinaryTree node = queue.poll();
            if (i < levelorder.length && levelorder[i] != -1) {
                node.left = new BinaryTree(levelorder[i]);
                queue.offer(node.left);
            }
            i++;
            if (i < levelorder.length && levelorder[i] != -1) {
                node.right = new BinaryTree(levelorder[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    public static void preorder(BinaryTree root, ll linked) {
        if (root == null)
            return;
        if (linked.head == null) {
            linked.head = new BinaryTree(root.data);
            linked.current = linked.head;
        } else {
            linked.current.right = new BinaryTree(root.data);
            linked.current = linked.current.right;
        }

        preorder(root.left, linked);
        preorder(root.right, linked);
    }

    public static void display(ll linked) {
        BinaryTree temp = linked.head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n1 = sc.nextLine().split(" ");
        int[] levelorder = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            levelorder[i] = Integer.parseInt(n1[i]);
        }
        BinaryTree root = buildTree(levelorder);
        ll linked = new ll();
        preorder(root, linked);
        display(linked);
    }
}
