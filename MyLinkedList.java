package dynamic_programming;



public class MyLinkedList {
	
	
	
	 class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	


 Node insert(Node head, int x) {
		Node nn = new Node(x);

		if (head == null) {
			head = nn;
		} else {
			Node curr = head;
			while (curr.next != null) {

				curr = curr.next;
			}
			curr.next = nn;
		}
		
		return head;

	}
	
	 void print(Node head){
		Node curr  = head;
		while(curr  != null) {
			System.out.print(curr.data+" ");
			curr =curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l = new MyLinkedList();
		Node head=null;;

		head = l.insert(head, 9);
		head = l.insert(head, 10);
		head = l.insert(head, 11);
		head = l.insert(head, 12);

		l.print(head);
	}

}
