import ArrayStack.ArrayStack;
import Clients.StackClient;
import LinkedListStack.LinkedListStack;

/*
 *
 * Created by joel on 24/09/16.
*/


public class Main {

    public static void main(String[] args) {
        //LinkedListStack impLink = new LinkedListStack();
        ArrayStack ArrS = new ArrayStack(10);
        StackClient Client1 = new StackClient();
        Client1.Stack(ArrS);
        //Client1.Stack(impLink);

    }
}
