class Node{
    int data;
    Node next;//next holds address of next node, type node class
    Node(int data)
    {
        this.data = data;
    }
}

class SinglyLinkedList{
    static Node head;//refering to first node
    static Node tail;//refering to last node// initially both are null

    //adding node to the last
    public static void addLast(int data)
    {
        Node nn = new Node(data);
        if(head==null) //checking for zero size where both head and tail are null
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

    //adding node to first
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