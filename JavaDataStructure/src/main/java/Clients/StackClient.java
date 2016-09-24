package Clients;

import DataStructureInterface.Stack;

/**
 * Created by joel on 24/09/16.
 */
public class StackClient {

    public void Stack(Stack S){

        System.out.println(S.pop());
        S.push(10);
        S.push(20);
        System.out.println(S.pop());
        S.pop();
        S.push(30);
        S.push(40);
        S.push(100);
        S.print();
    }

}
