


class Node {
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val= val;
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

    public static int size(Node root){
        return (root==null)? 0 : (1 + size(root.left) + size(root.right));
    }

    public static int sum(Node root){
        return (root==null)? 0: (root.val + sum(root.left) + sum(root.right));
    }

    public static int product(Node root){
        return (root==null)? 1: Math.abs(root.val * product(root.left) * product(root.right));
    }

     public static int productOfNonZero(Node root){
        if(root == null) return 1;
        if(root.val == 0){
            
        }
    }
  public static void main(String[] args) {

    Node a = new Node(3);//root node
    Node b =new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(-1);
    Node f = new Node(6);
    Node g = new Node(9);
    a.left = b; a.right=c;
    b.left =d; b.right = e;
    c.left = f; e.right=g;
    Display(a);

    
     System.out.println();
     System.out.print(size(a));

     
    System.out.println();//7
   System.out.print(sum(a));//24

   
    System.out.println();
    System.out.print(product(a)); // 1296

    
    System.out.println();
    System.out.print(productOfNonZero(a));
      
  }
}