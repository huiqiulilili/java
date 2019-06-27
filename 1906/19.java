abstract class List{
	private int size;
	
	List(){
		int size = 0;
	}
	
	public abstract void insert(int index,int val);
	
	protected void incSize() {
		size++;
	}
	
	public int getSize() {
		return size;
	}
}

class Node{
	int val;
	Node next = null;; 
	Node(int val){
		this.val = val;
	}
	Node(int val,Node head){
		this.val = val;
		this.next = head;
	}
}
class LinkedList extends List{
	private Node head = null;

	public void insert(int index,int val){
		if(index == 0){
			head = new Node(val,head);
		}else{
			Node prev = head;
			for(int i = 0;i < index - 1;i ++){
				prev = prev.next;
			}
			prev.next = new Node(val,prev.next);
			
		}
		incSize();
	}
	
	
	
}

class Practice{
	
} 
