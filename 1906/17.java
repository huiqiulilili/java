class Node{
	int val;
	Node random;
	Node next;
	public Node(int val){
		this.val = val;
	}
}


public class Practice{
	
	Node copyRandomList(Node head){
		
		if(head == null){
			return null;
		} 
		//1.复制链表
		
		Node cur = head;
		while(cur != null){
			Node node = new Node(cur.val);
			
			node.next = cur.next;
			cur.next = node;
			
			cur = cur.next.next;
			
		}
		//2.前面怎么指向
		
		Node cur = head;
		while(cur != null){
			if(cur.random != null){
		cur.next.random = cur.random.next;
			}else{
				cur.next.random = null;
			}
			
		
		cur = cur.next.next;
			
		}
		//分开
		Node cur = head;
		while(cur != null){
			//node 指向  cur 的下一个
			Node node = cur.next;
			
            cur.next = node.next;
			if(node.next == null){
				node.next = null;
			}else{
			node.next = node.next.next;
			}
			
			cur = cur.next;
		}
		
	}
	
}









