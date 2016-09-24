package LinkedListStack;

/**
 * Created by joel on 24/09/16.
 */
public class Node {
    /*
    @data to hold data in it.
    @next handle will hold the address of the next node.
     */
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    /*
    getting the data
     */

    public int getData(){
        return data;
    }

    /*
    getting the next node
     */

    public Node getNext(){
        return next;
    }


    /*
    setting the data
     */

    public void setData(int data){
        this.data = data;

    }

    public void setNext(Node next){
        this.next = next;
    }


}
