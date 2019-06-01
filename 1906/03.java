class Node{
	int value;
	Node next = null;
}
public class p{
	
	public static Node reverseList(Node head){
		Node newList = null;
		Node cur = head;
		
		while(Node cur != null){
			Node next = cur.next;
			//
			cur.next = newList;
			//
			newList = cur;
			 
			cur = next;
		}
		return newList;
	}
	
	public ListNode removeElement(ListNode head,int val){
		if(head == null){
			return null;
		}
		ListNode cur = head.next;
		ListNode prev = head;
		while(cur != null){
			if(cur.val == val){
				prev.next = cur.next;
			}else{
				prev = cur;
			}
			cur = cur.next;
		}
		if(head.val == val){
			head = head.next;
		}
		return head;
	}
	
	public ListNode removeElement1(ListNode head,int val){
		ListNode newList = null;
		ListNode cur = head;
		while(cur != null){
			ListNode next = cur.next; 
			//头插
			if(newList == null){
				cur.next = newList;
                newList = cur;				
			}
			//尾插
			else{
			ListNode last = newList;
			while(last.next != null){
				last = last.next;
			}
			last.next = cur;
			cur.next = null;
			}
			cur = next;
		}
		return newList;
	}
	
	
	
	
	
}
