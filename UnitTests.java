public class UnitTests {


    public static LinkedList addtwoLinkedList(LinkedList l1, LinkedList l2) {
        LinkedList sumLinkedList = new LinkedList();
        Node currentL1 = l1.headNode;
        Node currentL2 = l2.headNode;
        int carry = 0;

        while(currentL1 != null || currentL2 != null || carry != 0) {
            int value1 = (currentL1 != null) ? currentL1.data : 0;
            int value2 = (currentL2 != null) ? currentL2.data : 0;

            int sum = value1 + value2 + carry;
            carry = sum / 10;
            
            sumLinkedList.append(sum % 10);
            
            if(currentL1 != null)  { currentL1 = currentL1.next; }
            if(currentL2 != null) { currentL2 = currentL2.next; }    
        }

        return sumLinkedList;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); 
        LinkedList l2 = new LinkedList(); 

        l1.display();
        //System.out.println(l1.isEmpty());

        l1.append(2);
        l1.append(4);
        l1.append(3);
        l1.display();

        System.out.println();
        l2.append(5);
        l2.append(6);
        l2.append(4);
        l2.display();

        System.out.println();
        LinkedList l3 = addtwoLinkedList(l1, l2);

        l3.display();


    }
}
