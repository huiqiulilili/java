class Node{
	int val;
	Node next;
}
public class Practice{
	public int getLength(Node head){
		int length = 0;
		for(Node cur = head;cur != null;cur = cur.next){
			length++;
		}
		return length;
	}
	public Node findMiddle(Node head){
		Node front = head;
		Node letter = head;
		while(front != null){
			front = front.next;
			if(front == null){
				break;
			}
			front = front.next;
			letter = letter.next;
		}
		return letter;
	}
	
}
