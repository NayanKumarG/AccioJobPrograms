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

    //display linked list 
    public static void display()
    {
        if(head==null)
        {
            System.out.println("No nodes found:");
        }
        else{
            Node cur = head;
            while(cur!=null)
            {
                System.out.print(cur.data+" ");
                if(cur.next!=null)
                {
                System.out.print("--> ");
                }
                cur=cur.next;
            }
            System.out.println();
        }
    }

    //remove node from first
    public static void removeFirst()
    {
        if(head==null)
        {
            System.out.println("No nodes to remove:");
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            head=head.next;
        }
    }

    //get the node given index
    public static Node getAt(int idx)
    {
       if(idx<0)
       {
        System.out.println("Index is out of bound:");
        return null;
       }
       Node cur = head;
       for(int i=0 ; i<idx ; i++)
       {
        if(cur==null)
        {
            System.out.println("Index out of bound:");
            return null;
        }
        cur = cur.next;
       }
       return cur; 
    }

    //add the node at given index
    public static void addAt(int idx , int data)
    {
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node nn = new Node(data);
        Node cur = getAt(idx-1);
        if(cur==null)
        {
            System.out.println("Index out of bound:");
            return;
        }
        Node nextCur = cur.next;
        cur.next=nn;
        nn.next=nextCur;
    }

    //remove last node
    public static Node removeLast()
    {
        if(head==null)
        {
            return null;
        }
        else if(head==tail)
        {
            Node tr = tail;
            removeFirst();
            return tr;
        }
        else{
            Node cur = head;
            while(cur.next!=tail)
            {
                cur = cur.next;
            }
            
            cur.next=null;
            Node tr = tail;
            tail=cur;
            return tr;
        }
    }
    public static void main(String []args)
    {
        for(int i=1 ; i<=5 ; i++)
        {
            addLast(i);
        }
        display();

        // removeFirst();
        // display();

        // Node ans = getAt(3);
        // if(ans!=null)
        // System.out.println(ans.data);

        // addAt(5 , 10);
        // display();
        Node ans = removeLast();
        System.out.println(ans.data);

    }



}