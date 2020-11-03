package Demo04Arrays;

import java.util.Arrays;

//如果是数值，默认升序（从小到大)
//如果是字符串，默认字母升序
//如果是自定义类型，自定义需要有Comparable或者Comparator接口的支持
public class Arrays_01 {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1={2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
