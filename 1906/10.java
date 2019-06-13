class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}

public class Interview{
	
	public ListNode deleteDuplication(ListNode pHead){
		
		if (pHead == null) {
			return null;
		}
		ListNode p1 = pHead;
		ListNode p2 = pHead.next;
		ListNode prev = new(0);
		ListNode fake = prev;
		
		while(p2 != null){
			if(p1.val != p2.val){
				//如果两个不相等
				prev = p1;
			}else{
				//如果两个相等
				while(p2 != null && p2.val == p1.val){
					p2 = p2.next;
				}
				prev.next = p2;
			}
				p1 = p2;
				if(p2 != null){
					p2 = p2.next;
				}
		}
	}
	return fake.next;
}
