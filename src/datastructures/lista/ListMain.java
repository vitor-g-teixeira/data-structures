package datastructures.lista;

public class ListMain {
    
    public static void main(String[] args) {
         // Creating a list
        List myList = new List();
        
        // testing print method logic
        System.out.println("Empty list: " + myList.print());
        myList.addElement(4);
        System.out.println("One element list: " + myList.print());
        
        // adding more elements and printing it
        myList.addElement(2);
        myList.addElement(0);
        System.out.println("Current list: " + myList.print());
        
         // adding element on a bigger position than expected
        System.out.println("");
        myList.addElementByPos(10, 3);
        System.out.println("Current list: " + myList.print());
        
        // removing by position and printing it
        myList.removeByPos(2);
        System.out.println("List after removing the 3rd element:" + myList.print());
        
        // printing getElementByPos
        System.out.println("\nElement on the 2nc position: " + myList.getElementByPos(1));
    }
    
}
