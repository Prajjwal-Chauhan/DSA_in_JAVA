import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

    public void verticalOrder(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map){
        if(root == null) return;
        if(!map.containsKey(distance)){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.data);
            map.put(distance,arr);
        }
        else {
            map.get(distance).add(root.data);
        }
        verticalOrder(root.left,distance - 1, map);
        verticalOrder(root.right,distance + 1, map);
    }
    public void printVerticalOrder(BinaryTreeNode<Integer> root){
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        verticalOrder(root, 0, map);
        for(Map.Entry<Integer,ArrayList<Integer>> m : map.entrySet()){
            System.out.println(m.getValue());
        }
    }

    int size(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int counter = 1;
        counter += size(root.left);
        counter += size(root.right);

        return counter;
    }

    int maxLevelL = 0;
    void leftView(BinaryTreeNode<Integer> root,int currLevel){
        if(root == null) return;

        if(maxLevelL < currLevel){
            System.out.println(root.data);
            maxLevelL = currLevel;
        }

        leftView(root.left, currLevel + 1);
        leftView(root.right, currLevel + 1);
    }

    int maxLevelR = 0;
    void rightView(BinaryTreeNode<Integer> root,int currLevel){
        if(root == null) return;

        if(maxLevelR < currLevel){
            System.out.println(root.data);
            maxLevelR = currLevel;
        }

        rightView(root.right, currLevel + 1);
        rightView(root.left, currLevel + 1);
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
            System.out.println("5> Left View");
            System.out.println("6> Right View");
            System.out.println("7> Vertical order traversal");
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

                case 5:
                    opr.leftView(root, n);
                    break;

                case 6:
                    opr.rightView(root, n);
                    break;

                case 7:
                    opr.printVerticalOrder(root);
                    break;
            
                default:
                    break;
            }
        }
        // BinaryTreeNode<String> b = new BinaryTreeNode<>();
    }
}
