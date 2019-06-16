class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}


class LinkedList{
	private int size;
	private Node head;
	
	public int size(){
		return size; 
	}
	
	public void pushFront(int val){
		Node node = new Node(val);
		
		node.next = head;
		head = node;
		size++;
	}
}



class ArrayList{
	private int[] array;
	private int size;
	
	
	public ArrayList(int cap){
		array = new int[cap];
		
	}
	
	
	public int size(){
		return size;
	}
	
	
	public void pushBack(int val) {
		// TODO: 先不考虑扩容问题
		array[size++] = val;
	}
}

public class Practice{
	
	
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		linkedList.pushFront(1);
		linkedList.pushFront(2);
		linkedList.pushFront(3);
		linkedList.pushFront(4);
		System.out.printf("%d",linkedList.size());
		
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1.pushFront(1);
		linkedList1.pushFront(2);
		linkedList1.pushFront(3);
		linkedList1.pushFront(4);
		linkedList1.pushFront(4);
		linkedList1.pushFront(4);
		System.out.printf("%d",linkedList1.size());
		
		
		ArrayList arrayList = new ArrayList();
		arrayList.pushBack(1);
		arrayList.pushBack(2);
		arrayList.pushBack(3);
		arrayList.pushBack(4);
		System.out.printf("%d",arrayList.size());
		
	}
	
}
