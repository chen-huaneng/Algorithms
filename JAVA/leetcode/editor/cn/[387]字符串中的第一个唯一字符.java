2023-11-21 23:47:41
//给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: 0
// 
//
// 示例 2: 
//
// 
//输入: s = "loveleetcode"
//输出: 2
// 
//
// 示例 3: 
//
// 
//输入: s = "aabb"
//输出: -1
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含小写字母 
// 
//
// Related Topics 队列 哈希表 字符串 计数 👍 713 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        var hashMap = new HashMap<Character, Integer>();
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);
                continue;
            }
            hashMap.put(ch, hashMap.get(ch) + 1);
        }

        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);
            if (hashMap.get(ch) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
