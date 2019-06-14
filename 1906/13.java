class Node{
	int val;
	Node next;
	public Node(int val){
		this.val = val;
	}
}

public class Interview{
	Node removeValue(Node head,int value){
		if(head == null){
			return null;
		}
        Node cur = head;
        Node pre = new Node(0);
		Node p = pre;
		pre.next = head;
        for(cur != null){
			if(cur.val == value){
				//删除cur节点
				pre.next = cur.next;
			}else{
			pre = pre.next;
			}
			cur = cur.next;
		}
		return p.next;
	}
}
