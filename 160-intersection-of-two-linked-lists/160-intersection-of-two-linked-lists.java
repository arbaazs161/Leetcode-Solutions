/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*int countA = getCount(headA);
        int countB = getCount(headB);
        int offset = 0;
        ListNode temp;
        
        if(countA > countB){
            offset = countA - countB;
            temp = intersect(headA, headB, offset);
        }
        else{
            offset = countB - countA;
            temp = intersect(headB, headA, offset);
        }
        
        return temp;*/
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b) {
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
    
    /*public ListNode intersect(ListNode headRefA, ListNode headRefB, int offset){
        
        for(int i = 0; i < offset; i++){
            headRefA = headRefA.next;
        }
        
        ListNode temp = null;
        
        while(headRefA != headRefB && headRefA!=null && headRefB!=null){
            headRefA = headRefA.next;
            headRefB = headRefB.next;
            
            if(headRefA == headRefB){
                temp = headRefA;
                return temp;
            }
            
            if(headRefA == null){
                return null;
            }
            if(headRefB == null){
                return null;
            }
        }
        
        return temp;
    }
    
    public int getCount(ListNode headRef){
        int count = 0;
        if(headRef == null){
            return 0;
        }
        
        while(headRef != null){
            count++;
            headRef = headRef.next;
        }
        
        return count;
    }*/
}