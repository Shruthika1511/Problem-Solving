package oops;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Circular{
    Node head;
    public boolean isCircular() {
        if (head == null) return false;

        Node temp = head.next;

        while (temp != null && temp != head) {
            temp = temp.next;
        }

        return (temp == head);
    }
}

public class CCLinkedListOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular list = new Circular();

        // Creating a circular linked list
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
        third.next = list.head; 
        System.out.println("Is the linked list circular? " + list.isCircular());
	}
}
