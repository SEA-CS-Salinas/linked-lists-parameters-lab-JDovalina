//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jacob Dovalina

public class ListNode implements Linkable {
    private Comparable listNodeValue; // Value stored in the node
    private ListNode nextListNode; // Reference to the next node

    // Default constructor - initializes to null
    public ListNode() {
        listNodeValue = null;
        nextListNode = null;
    }

    // Constructor that sets the value and next node
    public ListNode(Comparable value, ListNode next) {
        listNodeValue = value;
        nextListNode = next;
    }

    // Returns the value stored in this node
    public Comparable getValue() {
        return listNodeValue;
    }

    // Returns the next node in the list
    public ListNode getNext() {
        return nextListNode;
    }

    // Sets the value of this node
    public void setValue(Comparable value) {
        listNodeValue = value;
    }

    // Sets the next node in the list
    public void setNext(Linkable next) {
        nextListNode = (ListNode) next;
    }
}
