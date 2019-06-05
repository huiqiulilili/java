
class Node{
	
	public int value;
	public Node next;
	
	public Node(int value){
		this.value = value;
		this.next = null;
	}
}
public class LinkedPopBack{
	
	
	//创建链表
	public static Node createLinkedList(){
		Node n1 = new Node(1);	// 首结点（头结点）
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
	
	//遍历
	public static void displayLinkedList(Node head){
	
	   for(Node cur = head;cur != null; cur = cur.next){
		  System.out.printf("%d-->",cur.value);
	   }
	
	   System.out.println("null");
    }
	
	//头插
	public static Node pushFront(Node head,int value){
		//申请新节点
		Node newNode = new Node(value);
		//更新newNode 的next
		newNode.next = head;
		//更新head
		return newNode;
	}
	
	//尾插
	public static Node pushBack(Node head,int value){
		if(head == null){
			return pushFront(head,value);
		}else{
			//申请新结点
			Node newNode = new Node(value);
			//找到最后结点
			Node last = getLast(head);
			//
			last.next = newNode;
			
			return head;
		}
	}
	//头删
	public static Node popFront(Node head){
		if(head == null){
			System.out.println("参数不合法，无法删除");
			return null;
		}else {
			return head.next;
		}
	}
	//尾删
	public static Node popBack(Node head){
		if(head == null){
			System.out.println("参数不合法，无法删除");
			return null;
		}else{
			Node lastlast = getLastLast(head);
			lastlast.next = null;
			return head;
		}
	}
	
	private static Node getLastLast(Node head){
		Node cur = head;
		for(;cur.next.next != null;cur = cur.next){
			
		}
		return cur;
		
	}
	
	public static Node getLast(Node head){
		Node cur = head;
		for(;cur.next != null;cur = cur.next){
			
		}
		return cur;
	}
	public static void main(String[] args){
		Node head = createLinkedList();
		displayLinkedList(head);
		head = pushBack( head,100);
		displayLinkedList(head);
		head = pushBack( head,101);
		displayLinkedList(head);
		head = pushBack( head,102);
		displayLinkedList(head);
		
		
		head = popFront(head);
		displayLinkedList(head);
		
		
		head = popBack(head);
		displayLinkedList(head);
		
	}
}
