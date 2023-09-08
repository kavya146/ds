package BinarySearchTree;

public class main {
    public static void main(String[] args) {

        BinarySearch p=new BinarySearch();
        p.insertion(8);
       p.insertion(4);
        p.insertion(9);
        p.insertion(11);
        p.insertion(10);

        System.out.println(p.search(87));
        System.out.print(p.height());
    }
}
