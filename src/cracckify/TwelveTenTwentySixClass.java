package cracckify;

public class TwelveTenTwentySixClass {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        TwelveTenTwentySixClass obj = new TwelveTenTwentySixClass();

        ListNode middle = obj.middleNode(head);

        System.out.println("Middle Node: " + middle.val);
        
        ListNode result = obj.removeElements(head, 4);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

	}
	public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next=head;

        ListNode currentNode = temp;

        while(currentNode.next!=null){
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return temp.next;
    }
	public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
	}
}

