package oops;
class CircularNode{
	int data;
	CircularNode next;
	CircularNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class CircularLinkedList
{
	CircularNode head;
	void append(int data)
	{
		CircularNode newNode=new CircularNode(data);
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
		}
		else
		{
			CircularNode current=head;
			while(current.next!=head)
			{
				current=current.next;
			}
			current.next=newNode;
			newNode.next=head;
		}
	}
	void printList()
	{
		if(head==null) return;
		CircularNode current =head;
		do
		{
			System.out.print(current.data+" ");
			current=current.next;
		}while(current!=head);
		System.out.println();
	}
}

public class CCLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list=new CircularLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(2);
		list.append(5);
		System.out.println("Circular LinkedList:");
		list.printList();

	}
}
