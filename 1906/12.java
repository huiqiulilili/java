class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}


public class Practice{
	
	public ListNode partition(ListNode head,int x){
		
		ListNode small = null;
		ListNode lastSmall = null;
		
		ListNode big = null;
		ListNode lastBig = null
		for(ListNode cur = head;cur != null;cur = cur.next){
			
			if(cur.val < x){
				//插入 small 中
				if(small == null){
					//头插
					small = cur;
				}else{
					//尾插
					lastSmall.next = cur;
				}
		    lastSmall = cur;
			}else{
				//插入 big 中
				if(big == null){
					//头插
					big = cur;
				}else{
					//尾插
					lastBig.next = cur;
				}
				lastBig = cur;
			}
		}
		if(lastSmall == null){
			return big;
		}else{
		lastSmall.next = big;
		//容易忽略的点
		if(big.next != null){
			lastBig.next = null;
		}
		}
	}
	
}
