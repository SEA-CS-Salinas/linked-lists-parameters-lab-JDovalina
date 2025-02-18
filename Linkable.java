//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jacob Dovalina

 */
public interface Linkable {
    Comparable getValue(); // Returns the value of the node
    Linkable getNext(); // Returns the next node in the list
    void setNext(Linkable next); // Sets the next node in the list
    void setValue(Comparable value); // Sets the value of the node
}
