package datastructures.lista;

public class List {
    
    // list attributes
    
    private int size = -1; // initialized as -1 so the 1st element is on pos 0, 2nd on pos 1, and so on.
    private ListNode firstElement;
    
    // adding elements on the list
    
    public void addElement(int value){
        ListNode newElement = new ListNode();
        if(this.isEmpty()){
            newElement.setValue(value);
            this.firstElement = newElement;
        }else{
            ListNode lastElement = this.firstElement;
            while(lastElement.getNext() != null){
                lastElement = lastElement.getNext();
            }
            newElement.setValue(value);
            lastElement.setNext(newElement);
        }
        this.add();
    }
    
    public void addElementByPos(int value, int pos)throws IndexOutOfBoundsException{
        if(this.isEmpty() || this.size == 0) this.addElement(value);
        else if(pos > this.size){
            this.addElement(value);
        }else if(pos < 0){
            IndexOutOfBoundsException e = new IndexOutOfBoundsException();
            throw e;
        }
        else{
            ListNode newValueElement = this.firstElement;
            int count = 0;

            while(count != pos){
                newValueElement = newValueElement.getNext();
                count++;
            }
            
            newValueElement.setValue(value);
        }
    }
    
    // removing elements from the list
    
    public int removeFirst(){
        if(this.isEmpty()){
            return -1;
        }
        this.remove();
        ListNode removedNode = this.firstElement;
        this.firstElement = removedNode.getNext();        
        return removedNode.getValue();
    }
    
    public int removeLast(){
        if(this.size == 0 || this.isEmpty()){
            return this.removeFirst();
        }
        this.remove();
        ListNode lastButOne = this.firstElement;
        ListNode removedNode = lastButOne.getNext();
        while(removedNode.getNext() != null){
            lastButOne = removedNode;
            removedNode = removedNode.getNext();
        }
        lastButOne.setNext(null);
        return removedNode.getValue();
    }
    
    public int removeByPos(int pos){
        if(this.isEmpty() || this.size == 0 || pos == 0) return this.removeFirst();
        else if(pos > this.size){
            return this.removeLast();
        }else if(pos == this.size){
            return this.removeLast();
        }
        int count = 0;
        ListNode beforeRemovedNode = new ListNode();
        ListNode removedNode = this.firstElement;
        ListNode afterRemovedNode = new ListNode();
        while(count != pos){
            beforeRemovedNode = removedNode;
            removedNode = removedNode.getNext();
            afterRemovedNode = removedNode.getNext();
            count++;
        }
        beforeRemovedNode.setNext(afterRemovedNode);
        this.remove();
        return removedNode.getValue();
    }
    
    // getting elements from the list
    
    public int getFirstElement(){
        if(this.isEmpty()){
            return -1;
        }
        return this.firstElement.getValue();
    }
    
    public int getLastElement(){
        if(this.isEmpty()){
            return -1;
        }
        ListNode toShow = this.firstElement;
        while(toShow.getNext() != null){
            toShow = toShow.getNext();
        }
        return toShow.getValue();
    }
    
    public int getElementByPos(int pos){
        if(this.isEmpty() || pos == 0) return this.getFirstElement();
        else if(pos > this.size){
            return this.getLastElement();
        }else if(pos == this.size) return this.getLastElement();
        ListNode toShow = this.firstElement;
        int count = 0;
        while (count != pos){
            toShow = toShow.getNext();
            count++;
        }
        return toShow.getValue();
    }
    
    // printing the list
    public String print(){
        if(this.isEmpty()) return "[]";
        
        int count = 0;
        String result = "[";
        ListNode currentDraw = this.firstElement;
        
        while(count != this.size){
            result = result + " " + currentDraw.getValue() + ",";
            if(currentDraw.getNext() != null) currentDraw = currentDraw.getNext();
            
            count++;
        }
        
        result = result + " " + currentDraw.getValue() + " ]";
        return result;
    }
    
    // simple methods
    
    private void add(){
        this.size++;
    }
    
    private void remove(){
        this.size--;
    }
    
     public int length(){
        return this.size + 1;
    }
     
    public boolean isEmpty(){
        if(this.size == -1) return true;
        return false;
    }
}
