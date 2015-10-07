 public ListNode sortList(ListNode head) {  
        // write your code here
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode mid=findMid(head);
        //split(head,mid);
        ListNode result=merge(sortList(head),sortList(mid));
        head=result;
        return result;
    }
    private ListNode findMid(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        //ListNode dummy=new ListNode(0);
        //dummy.next=head;
        while(fast.next!=null){
            fast=fast.next;
            if(fast.next!=null){ 
            slow=slow.next;
            //dummy=dummy.next;
            fast=fast.next;}
        }
        ListNode middle=slow.next;
        slow.next=null;
        //dummy.next=null;
        return middle;
    }
    private ListNode merge(ListNode head, ListNode mid){
        if(head==null&&mid==null) return null;
        if(head==null&&mid!=null) return mid;
        if(head!=null&&mid==null) return head;
        ListNode result=new ListNode(0);
        ListNode dummy=result;
        if(head.val<mid.val){result.next=head;result=result.next;result.next=merge(head.next,mid);}
        else {result.next=mid;result=result.next;result.next=merge(head,mid.next);}
        return dummy.next;
    }
