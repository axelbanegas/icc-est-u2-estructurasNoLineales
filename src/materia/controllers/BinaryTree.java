package materia.controllers;
import materia.models.Node;

public class BinaryTree{
    private Node root;

    public BinaryTree(){
        this.root = null;
    }

    public void insert(int value){
        root = insertRec(root, value);
    }
    private Node insertRec(Node padre, int value){
        if(padre == null){
            return new Node(value);
        }
        if (value < padre.getValue()){
            Node newNode = insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);
        }else if (value > padre.getValue()){
             
            padre.setRight(insertRec(padre.getRight(), value));

        }

        return  padre;
    }

    public void imprimirArbol(){
        imprimirArbolRec(root);
    }
    private void imprimirArbolRec(Node node){
        if (node != null){
            System.out.println(node.getValue() +", ");
            imprimirArbolRec(node.getLeft());
        }
    }
    public void printPosOrder() {
        printPosOrderRec(root);
    }
    private void printPosOrderRec(Node node) {
        if (node != null) {
            printPosOrderRec(node.getLeft());
            printPosOrderRec(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
    public void printerInOrder() {
        printerInOrderRec(root);
    }
    private void printerInOrderRec(Node node) {
        if (node != null) {
            printerInOrderRec(node.getLeft());
            System.out.print(node.getValue() + " ");
            printerInOrderRec(node.getRight());
        }
    }
}