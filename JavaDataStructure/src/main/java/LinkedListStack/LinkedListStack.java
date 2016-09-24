package LinkedListStack;


import DataStructureInterface.Stack;

/**
 * Created by joel on 24/09/16.
 */
public class LinkedListStack implements Stack {

    private Node head;

    @Override
    public void push(int data) {
        if(head == null){
            head = new Node(data);
        }else{
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
    }

    @Override
    public int pop() {
        int tempData = 0;
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }else{

            tempData = head.getData();
            head = head.getNext();
            return  tempData;
            /*Node temp = head.getNext();
            tempData = head.getData();
            head = temp;
            return tempData;*/
        }

    }

    @Override
    public void print() {
        Node tempNode = head;
        if(tempNode == null){
            System.out.println("Stack is Empty");
        }else{
            while(tempNode != null){
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
        }
    }
}
