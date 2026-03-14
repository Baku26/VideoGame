class Node {
    int data;
    Node previous;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
    class AndrewCicularLinkedList {
        private Node head = null;
        private Node tail = null;
        
        public void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
                
            }
            else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
                head.previous = tail;
                
                
            }
        }
    }
