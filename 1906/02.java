//结点
class Node{
	public int value;//保存节点中的数据
	public Node next = null;//指向下一节点的引用
	public Node(int value){
		this.value = value;
	}
}

public class List{
	
	public static void display(Node head){
		for(Node cur = head;cur != null;cur = cur.next){
			System.out.printf("%d--->",cur.value);
		}
		System.out.println("null");
	}
	
	//头插
	public static Node pushFront(Node head,int value){
		//申请新节点
		Node newNode = new Node(value);
		//
		newNode.next = head;
		//
		return newNode;
		
	}
	
	//尾插
	public static Node pushBack(Node head,int value){
		if(head == null){
			return pushFront(head,value);
		}else{
			//申请新节点
			Node newNode = new Node(value);
			//找到最后一个节点
			Node last = getLast(head);
			//
			last.next = newNode;
			return head;
		}
	}
	public static Node getLast(Node head){
		Node cur = head;
        while(cur.next != null){
			cur = cur.next;
		}	
        return cur;		
	}
	
	public static void main(String[] args){
		Node head = null;
		head = pushBack(head,1);
		head = pushBack(head,2);
		head = pushBack(head,3);
		display(head);
		head = pushBack(head,10);
		head = pushBack(head,20);
		head = pushBack(head,30);
		display(head);
	}
}
