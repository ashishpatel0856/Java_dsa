
import java.util.LinkedList;
import java.util.Queue;
class Node {
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val= val;
    }
}

class Pair{
    Node node;
    int level;
   public Pair(Node node , int level){
        this.node = node;
        this.level = level;
    }
}
public  class ImplBT {
    public static void Display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);

        
        // Display(root.right);
        // System.out.print(root.val+" ");
        // Display(root.left);

        // Display(root.left);
        //  Display(root.right);
        // System.out.print(root.val+" ");    
        
    }

    public static void preorder(Node root){
        if(root ==null) return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

     public static void inorder(Node root){
        if(root ==null) return;
        
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }


     public static void postorder(Node root){
        if(root ==null) return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +" ");
    }


    public static int size(Node root){
        return (root==null)? 0 : (1 + size(root.left) + size(root.right));
    }

    public static int sum(Node root){
        return (root==null)? 0: (root.val + sum(root.left) + sum(root.right));
    }

    public static int product(Node root){
        return (root==null)? 1: Math.abs(root.val * product(root.left) * product(root.right));
    }

    //  public static int productOfNonZero(Node root){
    //     if(root == null) return 1;
    //     if(root.val == 0){
            
    //     }
    // }

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left), max(root.right))); //9
    }
    

    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right))); //-1 
    }


    public static int levels(Node root){
        if(root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }


    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }



    }

    public static void levelOrderWithlinewise(Node root){
        Queue<Pair> q  = new LinkedList<>();
        int currlevel =0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!= currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null)  q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
        }
        System.out.println();
    }
  public static void main(String[] args) {

    Node a = new Node(3);//root node
    Node b =new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);
    a.left = b; a.right=c;
    b.left =d; b.right = e;
    c.left = f; 
    e.right=g;
    Display(a);

    System.err.println(" ");
    preorder(a);
    System.err.println(" ");
    inorder(a);
    System.err.println(" ");
    postorder(a);

    
     System.out.println();
     System.out.print(size(a));

     
    System.out.println();//7
   System.out.print(sum(a));//24

   
    System.out.println();
    System.out.print(product(a)); // 1296

    
    // System.out.println();
    // System.out.print(productOfNonZero(a));

    System.out.println();
    System.out.println(max(a)); //9


    System.out.println();
    System.out.println(min(a));

    System.out.println(levels(a)-1);//3

    System.out.println();
    levelOrder(a);

    System.out.println();
    levelOrderWithlinewise(a);
      
  }
}