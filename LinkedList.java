public class LinkedList {
    public Node headNode;

    public LinkedList(int data) {
        Node newNode = new Node(data);
        this.headNode = newNode;
    }

    public LinkedList() {
        this.headNode = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if(this.headNode == null) {
            this.headNode = newNode;
        } else {
            Node currentNode = this.headNode;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void display() {
        Node currentNode = this.headNode;

        if (currentNode != null) {
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Empty");
        }

        
    }

    public Node deleteNode(int data) {
        if (this.headNode == null) 
            return null;

        if (this.headNode.data == data) {
            this.headNode = this.headNode.next;
            return this.headNode;
        }

        Node current = this.headNode;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return this.headNode;
            }

            current = current.next;
        }

        return this.headNode;

    }

    public boolean isEmpty() {
        return this.headNode == null;
    }
}