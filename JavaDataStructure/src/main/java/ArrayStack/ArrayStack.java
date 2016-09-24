package ArrayStack;

import DataStructureInterface.Stack;

/**
 * Created by joel on 24/09/16.
 */
public class ArrayStack implements Stack {

    private int [] Stk;
    private int sp;

    public ArrayStack(int sp) {
        this.sp = sp;
        this.Stk = new int[sp];
    }

    @Override
    public void push(int data) {

        if(sp == 0){
            System.out.println("Stack is full");
        }else{
            sp = sp-1;
            Stk[sp] = data;
        }

    }

    @Override
    public int pop() {
        int temp = -1;
        if(sp==Stk.length){
            System.out.println("Stack is empty");
        }else{
            temp = Stk[sp];
            sp = sp+1;
        }
        return temp;
    }

    @Override
    public void print() {
        if(sp==Stk.length){
            System.out.println("Stack is Empty");
        }else {
            for (int i = Stk.length-1; i >=sp ; i--) {
                System.out.println(Stk[i]);
            }
        }
    }
}
