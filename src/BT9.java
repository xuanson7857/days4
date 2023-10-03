public class BT9 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,4,5,54,465,6,5,53,6,3,99};
        int max = num[0];
        int gầnMax = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                gầnMax = max;
                max = num[i];
            }else if (gầnMax < num[i] && num[i] != max){
                gầnMax = num[i];
            }
        }
        System.out.println("Số lớn thứ 2 là: " + gầnMax);
    }
}
