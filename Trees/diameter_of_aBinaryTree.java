import java.io.*;
import java.util.*;

//Atomic node of our Bianry tree
class Node {
    int value ,lt ,rt;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
 //Binary tree class
 class BinaryTree{
    Node root;
    int max = 0;
    BinaryTree(int value){
        this.root = new Node(value);
    }
    public void addNode(int value, String position){
        Node temp = new Node(value);
        Node current = this.root;
        for(String c : position.split("")){
            if(c.equals("R")){
                if(current.right == null){
                   current.right = temp;
                   System.out.println(value);
                   break;
                }else{
                    current = current.right; 
                }
            }else if(c.equals("L")){
                if(current.left == null)
                    current.left = temp;
                    System.out.println(value);
                    break;
               }else{
                    current = current.left;
                }
             }
         
    }

    private int traverseInOrder(Node node){
        if (node != null) {
            node.rt = traverseInOrder(node.right);
            node.lt = traverseInOrder(node.left );

            if( node.rt +  node.lt + 1 > max)
              this.max =  node.rt +  node.lt + 1 ;
            this.max = node->lt > node->rt ? node->lt + 1 : node->rt + 1;
            return this.max;
        }
        return 0;
    }

    public int getDiametre(){
        Node node = this.root;
        return traverseInOrder(node);
    }

    

 }

 class diameter_of_aBinaryTree{
    //program test
    public static void main(String args[]) throws IOException{
        File file = new File("/home/abdellah/Bureau/Summer 2022/Software Engineering/Problem_Solving/HackerEarth/test.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String[] str = br.readLine().split(" "); 
            int N = Integer.parseInt(str[0]) ;
            BinaryTree bTree =  new BinaryTree(Integer.parseInt(str[1]));
            for(int i=0 ; i<N-1;i++){
                String position = br.readLine();
                int value = Integer.parseInt(br.readLine());
                bTree.addNode(value, position);
            }


            System.out.print("Diametre of binary tree is : "+bTree.getDiametre()+"\n");
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }

   }
 }

 /*
  * Other aproach to resolve leetCode diameter_of_aBinaryTree

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
 *
        class Solution {

            int result = -1;

            public int diameterOfBinaryTree(TreeNode root) {
                dfs(root);
                return result;
            }

            private int dfs(TreeNode current) {
                if (current == null) {
                    return -1;
                }
                int left = 1 + dfs(current.left);
                int right = 1 + dfs(current.right);
                result = Math.max(result, (left + right));
                return Math.max(left, right);
            }
        }
  */