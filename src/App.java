
import materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        
        BinaryTree ab = new BinaryTree();
        ab.insert(50);
        ab.insert (19);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);
        System.out.print("PosOrden= ");
        ab.printPosOrder();
        System.out.println(" ");
        System.out.print("InOrden= ");
        ab.printerInOrder();
    }
}
