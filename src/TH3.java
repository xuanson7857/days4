public class TH3 {
    public static void main(String[] args) {
        int[] arr = {1,675,65,65,99,60,8,46};
        int maxValue = arr[0];
        for (int e :arr) {
            if (e > maxValue) {
                maxValue = e;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
    }
}
