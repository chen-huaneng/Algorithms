2023-11-15 23:20:13
//书店店员有一张链表形式的书单，每个节点代表一本书，节点中的值表示书的编号。为更方便整理书架，店员需要将书单倒过来排列，就可以从最后一本书开始整理，逐一将书放
//回到书架上。请倒序返回这个书单链表。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [3,6,4,1]
//
//输出：[1,4,6,3]
// 
//
// 
//
// 提示： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 468 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] reverseBookList(ListNode head) {
        var temp = new ArrayList<Integer>();
        while (head != null) {
            temp.add(head.val);
            head = head.next;
        }
        int size = temp.size();
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = temp.get(size - i - 1);
        }
        return array;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
