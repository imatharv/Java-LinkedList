package LinkedList;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void add(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
		}
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = new_node;
		}
	}
	
	public void append(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
		}
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = new_node;
		}
	}
	
	public void appendAfter(Node prev_node, int data) {
  	     if(prev_node == null) {
  	    	 System.out.println("Previous node shouldn't be null..");
  	     }
  	 
  	     Node new_node = new Node(data);
  	     new_node.next = prev_node.next;
  	     prev_node.next = new_node;
	} 	
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	
	void printList()
	{
		 Node currNode = head; 
		 System.out.println("LinkedList: "); 
	     while (currNode != null) { 
	    	 System.out.print(currNode.data + " -> ");        
	    	 currNode = currNode.next; 
	     }
	     System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinkedList object = new LinkedList();
		
		object.append(56);
		object.append(70);
		
		object.appendAfter(object.head,30);
		
		object.printList();
		
		object.deleteFirst();
		
		object.printList();
	}
}
