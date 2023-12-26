class Node 
{
    String data;
    Node next;

    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist 
{
    Node head;
    Linkedlist()
    {
        this.head = null;
    }

    void insertFromFirst(String data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
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
    public static void main(String args[])
    {
        System.out.println("Hello World");

        Linkedlist li = new Linkedlist();

        li.insertFromFirst("World");
        li.insertFromFirst("Hello");

        System.out.println("Linkedlist: ");
        li.printList();
    }
}