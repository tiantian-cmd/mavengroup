package suanfa;

import java.util.Arrays;

public class InsertSortUtils {

    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                //假如找到比参考值大，数
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {

                    break;
                }
            }
            array[j + 1] = temp;
            System.out.println("第" + i + "趟排序后:" + Arrays.toString(array));
        }
        return array;
    }
}