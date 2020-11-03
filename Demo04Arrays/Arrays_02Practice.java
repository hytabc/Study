package Demo04Arrays;

import java.util.Arrays;

//升序排列，倒序打印
public class Arrays_02Practice {
    public static void main(String[] args) {
        String str = "sdhalsi7253dljahs";
        //升序排列：sort
        //必须是数组，才能用Arrays.sort
        //String --> 数组,用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//升序排列
        //倒序遍历
        //chars.fori 正序
        //for (int i = 0; i < chars.length; i++) {}
        //chars.forr 倒序：
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
