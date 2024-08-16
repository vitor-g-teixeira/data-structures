package datastructures.pilha;
import datastructures.lista.List;
import datastructures.lista.ListNode;
import java.util.EmptyStackException;

public class Stack {
    private List stackElements = new List();
    
    public void push(int value){
        stackElements.addElement(value);
    }
    
    public int pop() throws EmptyStackException {
        if(!this.stackElements.isEmpty()){
            int last = this.stackElements.getLastElement();
            this.stackElements.removeLast();
            return last;
        }else{
            throw new EmptyStackException();
        }
    }
    
    public int peek() throws EmptyStackException {
        if(!this.isEmpty()) return this.stackElements.getLastElement();
        else{
            EmptyStackException e = new EmptyStackException();
            throw e;
        }
    }
    
    public boolean isEmpty(){
        return this.stackElements.isEmpty();
    }
}
