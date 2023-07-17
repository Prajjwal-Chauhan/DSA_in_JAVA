import java.util.Scanner;

class BinaryTreeNode<T>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data){
        this.data = data;
    }
}

class BinaryTreeOperations{
    String nodeName = "root";
    Scanner sc = new Scanner(System.in);

    BinaryTreeNode<Integer> insert(){
        System.out.println("Enter the " +nodeName+ " Data or enter -1 to exit");
        int data = sc.nextInt();
        if(data == -1) return null;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
        nodeName = "left";
        node.left = insert();
        nodeName = "right";
        node.right = insert();
        nodeName = "root";
         return node;
    }

    int height (BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int value = Math.max(leftHeight,rightHeight);
        return value + 1;

    }

    int size(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int counter = 1;
        counter += size(root.left);
        counter += size(root.right);

        return counter;
    }

    void print(BinaryTreeNode<Integer> root){
        if(root == null) return;
        String result = "";
        result += root.data + "->";
        if(root.left != null) result += " Left "+root.left.data;
        if(root.right != null) result += " Right "+root.right.data;
        System.out.println(result);
        print(root.left);
        print(root.right);
    }

    void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    
    void inOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    void postOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}

/**
 * BinaryTree
 */
public class BinaryTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeOperations opr = new BinaryTreeOperations();
        BinaryTreeNode<Integer> root = null;
        while(true){
            System.out.println("Binary Tree Operations");
            System.out.println("1> Insert");
            System.out.println("2> Print");
            System.out.println("3> Height");
            System.out.println("4> Size");
            System.out.print("Enter Choice :");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    root = opr.insert();
                    break;

                case 2:
                    opr.print(root);
                    break;

                case 3:
                    System.out.println(opr.height(root));
                    break;

                case 4:
                    System.out.println(opr.size(root));
                    break;
            
                default:
                    break;
            }
        }
        // BinaryTreeNode<String> b = new BinaryTreeNode<>();
    }
}
