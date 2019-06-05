class Node{
	public int value;
	public Node next;
	
	public Node (int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	
	//遍历一个链表
	public static void displayLinkedList(Node head){
		
		for(Node cur = head;cur != null;cur = cur.next){
			System.out.printf("(%d)-->",cur.value);
		}
		System.out.printf("null");
	} 
	
	public static Node createLinkedList(){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		return n1;
		
	}
	
	public static void main(String[] args){
		displayLinkedList(createLinkedList());
	}
}
