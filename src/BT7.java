public class BT7 {
    public static void main(String[] args) {
        int[][] arrSqued = new int[3][3];
        arrSqued[0][0] = 1;
        arrSqued[0][1] = 2;
        arrSqued[0][2] = 3;
        arrSqued[1][0] = 4;
        arrSqued[1][1] = 5;
        arrSqued[1][2] = 6;
        arrSqued[2][0] = 7;
        arrSqued[2][1] = 8;
        arrSqued[2][2] = 9;
        int sum = 0;
        for (int j = 0; j < arrSqued.length; j++) {
            sum += arrSqued[j][j];
        }
        System.out.println("Đường chéo chính có tổng là:\n"+sum);
        sum = 0;
        for (int i = 0; i < arrSqued.length; i++) {
            for (int j = 0; j < arrSqued[i].length; j++) {
                if (i+j == arrSqued[i].length -1){
                    sum += arrSqued[i][j];
                }
            }
        }
        System.out.println("Đường chéo phụ có tổng là:\n"+sum);
    }

}