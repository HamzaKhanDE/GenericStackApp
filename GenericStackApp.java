import java.util.LinkedList;

class GenericStack<E> {

    // Generic linked list
    private LinkedList<E> linkedList;

    // Constructor
    public GenericStack(){
        this.linkedList = new LinkedList<E>();
    }

    // Push: adding element at last
    public E push(E obj){
        linkedList.add(obj);
        return obj;

    }

    // Peek: returning last element
    public E peek(){

        int lastElemtPos = linkedList.size()-1;
        return linkedList.get(lastElemtPos);

    }

    // Pop: removing and returning element from last
    public E pop(){
        int lastElemtPos = linkedList.size()-1;
        E lastElement = linkedList.get(lastElemtPos);
        linkedList.remove(lastElemtPos);
        return lastElement;
    }

    public int size(){
        return linkedList.size();
    }
}

public class GenericStackApp {
    public static void main(String[] args) {

        GenericStack<String> stack = new GenericStack<String>();

        System.out.println("Initiating push operations");
        System.out.println("Push: "+stack.push("Apples"));
        System.out.println("Push: "+stack.push("Oranges"));
        System.out.println("Push: "+stack.push("Bananas"));
        System.out.println("The stack contains "+stack.size()+" elements");

        System.out.println("\nInitiating Peek operation");
        System.out.println("Peek: "+stack.peek());
        System.out.println("The stack contains "+stack.size()+" elements");

        System.out.println("\nInitiating Pop operation");
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("The stack contains "+stack.size()+" elements");
    }
}
