package datastructures;

public class ListNode {
    private int value;
    private ListNode nextElement = null;
    
    // setters
    
    public void setValue(int value){
        this.value = value;
    }
    
    public void setNext(ListNode nextElement){
        this.nextElement = nextElement;
    }
    
    // getters
    
    public int getValue(){
        return this.value;
    }
    
    public ListNode getNext(){
        return this.nextElement;
    }
    
}
