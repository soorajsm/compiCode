class MyLinkedList {

    Node head;
    int length;

    
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data) 
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    
    }

    public MyLinkedList()
    {
        head=null;
        length=0;
    }
    
    public int get(int index) {
        Node curr=head;
        int count=0;
        if(index < 0 || index>=length)
            return -1;

        while(count<index)
        {
            curr=curr.next;
            count++;
        }
        return (curr != null) ? curr.data : -1;
    }
    
    public void addAtHead(int val) {

        Node newNode=new Node(val);
        length++;
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    
    public void addAtTail(int val) {
       
        Node newNode=new Node(val);
        Node curr=head;
        length++;
        if(head==null)
        {
            head=newNode;
            return;
        }
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
        
    }
    
    public void addAtIndex(int index, int val) {
        Node curr=head;
        Node newNode=new Node(val);
        
        if(index>length)
            return ;

        length++;

        if(index==0)
        {
            addAtHead(val);
            return;
        }

        int count=0;
        while (count < index - 1)                         
        {
            curr = curr.next;
            count++;
        }
        

        newNode.next=curr.next;
        if(curr.next!=null)curr.next.prev=newNode;
        curr.next=newNode;
        newNode.prev=curr;
        
    }
    
    public void deleteAtIndex(int index) {
        Node curr=head;
        

        if(index < 0 || index>=length)
            return;
            
        length--;

        if(index==0)
        {
            head=head.next;
            return;
        }
        
        int count=0;
        while(count<index-1)
        {
            curr=curr.next;
            count++;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
            if(curr.next!=null)curr.next.prev=curr;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */