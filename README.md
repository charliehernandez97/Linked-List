<h1>Linked List Project</h1>
This project implements a singly linked list in Java with the following methods:

<li>append: Adds a new node to the end of the linked list.</li>
<li>deleteNode: Deletes a node from the linked list.</li>
<li>isEmpty: Returns true if the linked list is empty, false otherwise.</li>

<h1>Usage</h1>
To use the linked list, create an instance of the LinkedList class and call the methods as needed. Here's an example:

```java
public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); 
        LinkedList l2 = new LinkedList(); 

        l1.display();

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

```
This will print
```
Empty
2 -> 4 -> 3 ->
5 -> 6 -> 4 ->
7 -> 0 -> 8 ->
```

<h1>Unit Tests</h1>
The UnitTests class contains tests for the linked list methods. It also includes a function to add two non-empty linked lists representing two non-negative integers stored in reverse order and return the sum as a linked list.
The code above is taken from this file.
