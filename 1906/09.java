class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}
public class Interview{
	public ListNode deleteDuplication(ListNode pHead){
		ListNode prev = new ListNode(0);
		prev.next = p1;
	    ListNode fake = prev;
	
	    ListNode p1 = pHead;
	    ListNode p2 = pHead.next;
	
	    while(p2 != null){
		    if(p1.val != p2.val){
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;
		    }else{
				while(p2 != null && p1.val == p2.val){
					p2 = p2.next;
				}
			}
			prev.next = p2;
			p1 = p2;
		    if(p2 != null){
				p2 = p2.next;
			}
	    }
		return fake.next;
    }
	
	
	
	public ListNode deleteDuplication1(ListNode pHead){
		ListNode prev = null;
	
	    ListNode p1 = pHead;
	    ListNode p2 = pHead.next;
	
	    while(p2 != null){
		    if(p1.val != p2.val){
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;
		    }else{
				while(p2 != null && p1.val == p2.val){
					p2 = p2.next;
				}
			}
			if(prev == null){
				pHead = p2;
			}else{
				prev.next = p2;
			}
			p1 = p2;
		    if(p2 != null){
				p2 = p2.next;
			}
	    }
		return pHead;
    }
	
}
