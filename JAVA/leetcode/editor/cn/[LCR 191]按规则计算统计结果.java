2023-11-20 23:57:19
//为了深入了解这些生物群体的生态特征，你们进行了大量的实地观察和数据采集。数组 arrayA 记录了各个生物群体数量数据，其中 arrayA[i] 表示第 
//i 个生物群体的数量。请返回一个数组 arrayB，该数组为基于数组 arrayA 中的数据计算得出的结果，其中 arrayB[i] 表示将第 i 个生物群体的数
//量从总体中排除后的其他数量的乘积。 
//
// 
//
// 示例 1： 
//
// 
//输入：arrayA = [2, 4, 6, 8, 10]
//输出：[1920, 960, 640, 480, 384]
// 
//
// 
//
// 提示： 
//
// 
// 所有元素乘积之和不会溢出 32 位整数 
// arrayA.length <= 100000 
// 
//
// 
//
// Related Topics 数组 前缀和 👍 352 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] statisticalResult(int[] arrayA) {
        int len = arrayA.length;
        if (len == 0) {
            return new int[0];
        }

        var arrayB = new int[len];
        arrayB[0] = 1;
        int tmp = 1;
        for (int i = 1; i < len; ++i) {
            arrayB[i] = arrayB[i - 1] * arrayA[i - 1];
        }

        for (int i = len - 2; i >= 0; --i) {
            tmp *= arrayA[i + 1];
            arrayB[i] *= tmp;
        }

        return arrayB;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
