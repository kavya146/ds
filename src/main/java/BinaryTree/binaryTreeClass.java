package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class binaryTreeClass {

    binaryTreeNode root;

    public  binaryTreeClass(){
        root=null;
    }

//
    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

//INSERTION
    public void insert(int val){

        binaryTreeNode newNode=new binaryTreeNode();
        newNode.data=val;

        if(isEmpty()){
            root=newNode;
            System.out.println("value added "+root.data);
        }

        else{
            List<binaryTreeNode> p=new ArrayList<>();
            p.add(root);

            while(true){
                binaryTreeNode temp=p.remove(0);

                if(temp.left!=null){
                    p.add(temp.left);
                }
                else{
                    p.add(newNode);
                    temp.left=newNode;
                    System.out.println("value added "+newNode.data);
                    break;
                }

                if(temp.right!=null){
                    p.add(temp.right);
                }
                else{
                    p.add(newNode);
                    temp.right=newNode;
                    System.out.println("value added "+newNode.data);
                    break;
                }
            }
        }
    }


//DELETION
    public binaryTreeNode delete(int val){
        List<binaryTreeNode> p=new ArrayList<>();
        p.add(root);

        while(!p.isEmpty()){
            binaryTreeNode currNode=p.remove(0);

            if(currNode.data==val){
                deepestNodeAndDelete(currNode);
                continue;
            }
            if(currNode.left!=null){
                p.add(currNode.left);
            }
            if(currNode.right!=null){
                p.add(currNode.right);
            }
        }
        return null;
    }

    private void deepestNodeAndDelete(binaryTreeNode nodeToDelete) {

        Stack<binaryTreeNode> p=new Stack<>();
        p.push(root);

        binaryTreeNode prev=null;
        binaryTreeNode deepestNode=null;
//finding deepest node and transfer data of nodeToDelete to deepest node
        while(!p.isEmpty()){
            prev=deepestNode;
            deepestNode=p.pop();

            if(deepestNode.left!=null){
                p.push(deepestNode.left);
            }
            if(deepestNode.right!=null){
                p.push(deepestNode.right);
            }
        }

        nodeToDelete.data= deepestNode.data;

        if(prev!=null){
            if(prev.left==deepestNode){
                prev.left=null;
            }
            else{
                prev.right=null;
            }
        }
    }

//SEARCH
    public boolean search(int val){

        if(root==null) {

            return false;
        }
            List<binaryTreeNode> p = new ArrayList<>();
            p.add(root);
            while(!p.isEmpty()) {
                binaryTreeNode temp = p.remove(0);
                if (temp.data == val) {
                    return true;
                }
                if (temp.left != null) {
                    p.add(temp.left);
                }
                if(temp.right!=null) {
                    p.add(temp.right);
                }
            }
            return false;
        }

//TRAVERSAL
   private void inOrder(binaryTreeNode node){
       if(node!=null){
           inOrder(node.left);
           System.out.print(node.data+" ");
           inOrder(node.right);
       }
   }

    public void inOrder(){
        inOrder(root);
    }

}
