import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution7Test extends Solution7 {

    @Test
    public void testSmallestStringWithSwaps() {
            // 测试目的：验证在不同情况下 smallestStringWithSwaps 方法的行为

            // 测试用例 1：测试基本情况，包括多次交换
            Solution7 solution = new Solution7();
            String s1 = "dcab";
            List<List<Integer>> pairs1 = new ArrayList<>();
            pairs1.add(Arrays.asList(0, 3));
            pairs1.add(Arrays.asList(1, 2));
            String result1 = solution.smallestStringWithSwaps(s1, pairs1);
            assertEquals("bacd", result1);

            // 测试用例 2：测试多次交换，包括重复交换
            String s2 = "dcab";
            List<List<Integer>> pairs2 = new ArrayList<>();
            pairs2.add(Arrays.asList(0, 3));
            pairs2.add(Arrays.asList(1, 2));
            pairs2.add(Arrays.asList(0, 2));
            String result2 = solution.smallestStringWithSwaps(s2, pairs2);
            assertEquals("abcd", result2);

            // 测试用例 3：测试不进行交换的情况
            String s3 = "cba";
            List<List<Integer>> pairs3 = new ArrayList<>();
            pairs3.add(Arrays.asList(0, 1));
            pairs3.add(Arrays.asList(1, 2));
            String result3 = solution.smallestStringWithSwaps(s3, pairs3);
            assertEquals("abc", result3);
    }
}