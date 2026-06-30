package leetcode;

public class Questions {
    //Leetcode 83
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head==null)
//        {
//            return head;
//        }
//        ListNode node=head;
//        while(node.next!=null)
//        {
//            if(node.val==node.next.val)
//            {
//                node.next=node.next.next;
//            }
//            else
//            {
//                node=node.next;
//            }
//        }
//        return head;
//    }

    //leet 141
//    public boolean hasCycle(ListNode head) {
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast!=null && fast.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
     // leetcode 876
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            ListNode s=head;
//            ListNode f=head;
//            while(f!=null && f.next!=null)
//            {
//                s=s.next;
//                f=f.next.next;
//            }
//            return s;
//
//        }
    //}
    // leetcode 202
//    class Solution {
//        public boolean isHappy(int n) {
//            int s=n;
//            int f=n;
//            do{
//                s=square(s);
//                f=square(square(f));
//            }
//            while(s!=f);
//            if(s==1)
//            {
//                return true;
//            }
//            return false;
//
//
//        }
//        private int square(int x)
//        {
//            int ans=0;
//            while(x>0)
//            {
//                int rem=x%10;
//                ans+=rem*rem;
//                x/=10;
//            }
//            return ans;
//        }
//    }
    // leetcode 148//
//    class Solution {
//        public ListNode sortList(ListNode head) {
//            if(head==null || head.next==null)
//            {
//                return head;
//            }
//            ListNode mid=middle(head);
//            ListNode right=mid.next;
//            mid.next=null;
//            ListNode left=head;
//            left=sortList(left);
//            right=sortList(right);
//            return mergesort(left,right);
//        }
//        private ListNode mergesort(ListNode l1,ListNode l2)
//        {
//            ListNode dummy=new ListNode(-1);
//            ListNode tail=dummy;
//            while(l1!=null && l2!=null)
//            {
//                if(l1.val <=l2.val)
//                {
//                    tail.next=l1;
//                    tail=l1;
//                    l1=l1.next;
//                }
//                else if(l1.val >l2.val)
//                {
//                    tail.next=l2;
//                    tail=l2;
//                    l2=l2.next;
//                }
//            }
//            if(l1!=null)
//            {
//                tail.next=l1;
//
//            }
//            else if(l2!=null)
//            {
//                tail.next=l2;
//
//            }
//            return dummy.next;
//
//        }
//        private ListNode middle(ListNode node)
//        {
//            ListNode s=node;
//            ListNode f=node.next;
//            while(f!=null && f.next!=null)
//            {
//                s=s.next;
//                f=f.next.next;
//            }
//            return s;
//
//        }
//    }
//    class Solution {
//        public ListNode reverseBetween(ListNode head, int left, int right)
//        {
//            if(head==null || left==right)
//            {
//                return head;
//            }
//            ListNode dummy=new ListNode(0);
//            dummy.next=head;
//            ListNode prev=dummy;
//            for(int i=1;i<left;i++)
//            {
//                prev=prev.next;
//            }
//            ListNode curr=prev.next;
//            for(int i=0;i<right-left;i++)
//            {
//                ListNode temp=curr.next;
//                curr.next=temp.next;
//                temp.next=prev.next;
//                prev.next=temp;
//            }
//            return dummy.next;
//        }
//    }

//    class Solution {
//        public boolean isPalindrome(ListNode head) {
//            if(head==null || head.next==null)
//            {
//                return true;
//            }
//            ListNode mid=middle(head);
//            ListNode heads=reverse(mid);
//            ListNode rehead=heads;
//            while(head!=null && heads!=null)
//            {
//                if(head.val!=heads.val)
//                {
//                    return false;
//                }
//                head=head.next;
//                heads=heads.next;
//            }
//            return true;
//
//
//        }
//        private ListNode reverse(ListNode nodes)
//        {
//            if(nodes==null || nodes.next==null)
//            {
//                return nodes;
//            }
//            ListNode prev=null;
//            ListNode pres=nodes;
//            ListNode next=nodes.next;
//            while(pres!=null)
//            {
//                pres.next=prev;
//                prev=pres;
//                pres=next;
//                if(next!=null)
//                {
//                    next=next.next;
//                }
//            }
//            return prev;
//        }
//        private ListNode middle(ListNode node)
//        {
//            ListNode s=node;
//            ListNode f=node;
//            while(f!=null && f.next!=null)
//            {
//                s=s.next;
//                f=f.next.next;
//            }
//            return s;
//        }
//    }

}
