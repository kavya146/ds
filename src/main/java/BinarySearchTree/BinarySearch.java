package BinarySearchTree;

public class BinarySearch {

    BinarySearchNode root;


    public boolean isEmpty(){
        if(root==null)
            return true;
        return false;
    }


    public void insertion(int val){
          BinarySearchNode newNode = new BinarySearchNode();
          newNode.data=val;

          if(root==null){
              root=newNode;
              System.out.println("inserted "+newNode.data);
          }

          else{
            BinarySearchNode currNode=root;
              while(currNode!=null){
                  BinarySearchNode leftChild=currNode.getLeft();
                  BinarySearchNode rightChild=currNode.getRight();

                  if(currNode.data>val){
                      if(leftChild==null){
                          leftChild=newNode;
                          currNode.setLeft(leftChild);
                          System.out.println("left inserted "+newNode.data);
                          break;
                      }
                      currNode=leftChild;
                  }
                  else {
                      if(rightChild==null){
                          rightChild=newNode;
                          currNode.setRight(rightChild);
                          System.out.println("right inserted "+newNode.data);
                          break;
                      }
                      currNode=rightChild;
                  }
              }
          }
    }

    public boolean search(int val){
        if(root==null)
            return false;

        BinarySearchNode currNode=root;

        while(currNode!=null){

            if(currNode.data==val)
                return true;
            else if(currNode.data>val)
                currNode=currNode.getLeft();
            else
                currNode=currNode.getRight();
        }
        return false;
    }

    private int height(BinarySearchNode root){
        if(root==null)
            return -1;

        int leftHt=height(root.getLeft());
        int rightHt=height(root.getRight());
        int maxi=1+Math.max(leftHt,rightHt);
        return maxi;
    }
    public int height(){
        return height(this.root);
    }

}
