
public class TH5 {
    public static void main(String[] args) {
        int[] arr = {99,675,65,65,99,60,8,46};
        int minValue = arr[0];
        for (int e :arr) {
            if (e < minValue) {
                minValue = e;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}