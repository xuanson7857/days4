import java.util.*;

public class BT2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Enter a size:");
            size = scr.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scr.nextInt();
        }
        System.out.println("Mảng hiện tại");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("Nhập phần tử bạn muốn thêm");
            int newValue = scr.nextInt();
            System.out.println("Nhập phần vị trí bạn muốn thêm");
            int index = scr.nextInt();
            arr = addNewValue(index, newValue, arr);
            System.out.println("mảng hiện tại");
            for (int el : arr) {
                System.out.print(el + " ");
            }
        }
    }

    public static int[] addNewValue(int index, int value, int[] arrays) {
        int[] newArrays;
        if (index <= arrays.length) {
            newArrays = new int[arrays.length + 1];
            for (int i = 0, j = 0; i < arrays.length; i++, j++) {
                if (index - 1 == i) {
                    newArrays[j++] = value;
                }
                newArrays[j] = arrays[i];
            }
        } else {
            newArrays = new int[index];
            System.arraycopy(arrays, 0, newArrays, 0, arrays.length);
            for (int i = arrays.length; i < newArrays.length; i++) {
                newArrays[i] = 0;
            }
            newArrays[index - 1] = value;
        }
        return newArrays;
    }
}
