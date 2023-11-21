2023-11-21 21:48:53
//假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。 
//
//
// 
//
// 示例 1： 
//
// 
//输入：path = "a.aef.qerf.bb"
//
//输出："a aef qerf bb"
//
// 
//
// 
//
// 限制： 
//
// 0 <= path.length <= 10000 
//
// Related Topics 字符串 👍 577 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String pathEncryption(String path) {
        char[] charArray = path.toCharArray();

        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] == '.') {
                charArray[i] = ' ';
            }
        }

        return new String(charArray);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
