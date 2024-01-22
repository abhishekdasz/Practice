// Node class represents a single node in the linked list
class Node 
{
    String data;
    Node next;

    // Constructor to create a new node with given data
    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist 
{
    Node head;

    // Constructor to initialize an empty linked list
    Linkedlist()
    {
        this.head = null;
    }

    void insertFromFirst(String data)
    {
        Node newNode = new Node(data);

        // If the linked list is empty, set the new node as the head
        if(head == null)
        {
            head = newNode;
            return;
        }
        // Set the next of the new node to the current head
        newNode.next = head;
        // Set the new node as the new head
        head = newNode;
    }

    void insertFromLast(String data) {
        Node newNode = new Node(data);

        // If the linked list is empty, set the new node as the head
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            // Traverse the linked list to find the last node
            Node last = head;
            while (last.next != null) 
            {
                last = last.next;
            }

            // Set the next of the last node to the new node
            last.next = newNode;
        }
    }

    void printList() 
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;            
        }
    }
    public static void main(String args[])
    {
        System.out.println("Hello World");

        Linkedlist li = new Linkedlist();

        li.insertFromFirst("World");
        li.insertFromFirst("Hello");

        li.insertFromLast("This");
        li.insertFromLast("is");
        li.insertFromLast("Abhishek");

        li.insertFromFirst("Hi,");

        System.out.println("Linkedlist: ");
        li.printList();

        li.deleteFirst();

        li.printList();
    }
}

