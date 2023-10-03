import java.util.*;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Nhập size: ");
            size = scanner.nextInt();
            if (size > 20 || size < 1){
                System.out.println("Tối đa 20 phần tử");
            }
        }while (size > 20 || size < 1);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int minNumber = arr[0];
        for (int j : arr) {
            if (j < minNumber) {
                minNumber = j;
            }
        }
        System.out.println(minNumber);
    }
}
