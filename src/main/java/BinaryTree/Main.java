package BinaryTree;

public class Main {

    public static void main(String[] args) {
        binaryTreeClass q=new binaryTreeClass();
        q.insert(95);
        q.insert(9);
        q.insert(3);
        q.insert(91);

        q.delete(91);
        boolean res=q.search(91);
        System.out.println(res + " Result");
        q.inOrder();




    }
}
