package datastructures;

public class ListMain {
    
    public static void main(String[] args) {
        List myList = new List();
        System.out.println(myList.print());
        myList.addElement(4);
        myList.addElement(2);
        myList.addElement(0);
        System.out.println(myList.print());
        
        myList.addElementByPos(10, 0);
        System.out.println(myList.print());
    }
    
}
