package datastructures;

public class List {
    
    private int size = -1;
    private ListNode firstElement;
    
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
    
    // isso vai dar mto erro
    public void addElementByPos(int value, int pos){
        if(this.isEmpty() || this.size == 1) this.addElement(value);
        else if(pos > this.size){
            System.out.println("Specified position is bigger than the list. Adding as last element");
            this.addElement(value);
        }else if(pos < 0) System.out.println("Invalid position");
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
    
    public int removeFirst(){
        if(this.isEmpty()){
            System.out.println("List is empty; return -1");
            return -1;
        }
        this.remove();
        ListNode removedNode = this.firstElement;
        this.firstElement = removedNode.getNext();        
        return removedNode.getValue();
    }
    
    public int removeLast(){
        if(this.size == 1 || this.isEmpty()){
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
        if(this.isEmpty() || this.size == 1) return this.removeFirst();
        else if(pos > size){
            System.out.println("Specified position is bigger than the list. Removing the last element");
            return this.removeLast();
        }else if(pos == size){
            return this.removeLast();
        }
        this.remove();
        int count = 1;
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
        return removedNode.getValue();
    }
    
    public int getFirstElement(){
        if(this.isEmpty()){
            System.out.println("List is empty; return -1");
            return -1;
        }
        return this.firstElement.getValue();
    }
    
    public int getLastElement(){
        if(this.isEmpty()){
            System.out.println("List is empty; return -1");
            return -1;
        }
        ListNode toShow = this.firstElement;
        while(toShow.getNext() != null){
            toShow = toShow.getNext();
        }
        return toShow.getValue();
    }
    
    public int getElementByPos(int pos){
        if(this.isEmpty() || pos == 1) return this.getFirstElement();
        else if(pos > this.size){
            System.out.println("Specified position is bigger than the list. Returning the last element");
            return this.getLastElement();
        }else if(pos == this.size) return this.getLastElement();
        ListNode toShow = this.firstElement;
        int count = 1;
        while (count != pos){
            toShow = toShow.getNext();
            count++;
        }
        return toShow.getValue();
    }
    
    // também está com erro
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
    
    
    public int getSize(){
        return this.size;
    }
    
    private void add(){
        this.size++;
    }
    
    private void remove(){
        this.size--;
    }
    
    public boolean isEmpty(){
        if(size == -1) return true;
        return false;
    }
}
