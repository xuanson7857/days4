import java.util.*;

public class BT1 {
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
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scr.nextInt();
        }
        System.out.println("Mảng hiện tại");
        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Nhập phần tử bạn muốn xóa");
        int deleteValue = scr.nextInt();
        if (check(deleteValue, arr)){
            int[] newArray = new int[size - 1];
            for (int i = 0; i < newArray.length; i++) {
                if (arr[i] != deleteValue) {
                    newArray[i] = arr[i];
                }else {
                    newArray[i] = arr[i+1];
                    i++;
                }
            }
            arr = newArray;
        }else {
            System.out.println("Khong tim thay gia tri nay");
        }
        System.out.println("Mảng bây giờ là");
        for (int el:arr) {
            System.out.print(el + " ");
        }
    }

    public static boolean check(int a,int[] arrays) {
        for (int element:arrays) {
            if (a == element) {
                return true;
            }
        }
        return false;
    }
}