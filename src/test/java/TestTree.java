import Sujujiego.FindTree;
import Sujujiego.Node;

public class TestTree {
    public static void main(String[] args){
        FindTree ft=new FindTree();
        int[] array={12,34,57,65,90,76,98,55};
        int j=0;
        Node root=new Node(array[j]);
        for (int i=1;i<array.length;i++){
            insert(root,array[i]);
        }
        System.out.println("preorder-----");
        ft.preOrder(root);
        System.out.println("inorder------");
        ft.inOrder(root);
        System.out.println("afterorder------");
        ft.afterOrder(root);
    }
    private static void insert(Node root,int data){
        if(root.getData()<data){
            if(root.getRight()==null){
                root.setRight(new Node(data));
            }
            else {
                insert(root.getRight(),data);
            }
        }
        else {

            if(root.getLeft()==null){
                root.setLeft(new Node(data));
            }
            else {
                insert(root.getLeft(),data);
            }
        }
    }
}
