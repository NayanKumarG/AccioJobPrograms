class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}

class SinglyLinkedList{
    static Node head;
    static Node tail;

    public static void addLast(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            tail.next=nn;
            tail=nn;
        }
    }
    public static void addFirst(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            nn.next=head;
            head=nn;
        } 
    }
    public static void main(String []args)
    {
        for(int i=1 ; i<=5 ; i++)
        {
            addFirst(i);
        }
        System.out.println(head.data);
        System.out.println(tail.data);
    }
}