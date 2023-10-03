import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        int[][] arrNumbers = new int[3][3];
        arrNumbers[0][0] = 5;
        arrNumbers[0][1] = 34;
        arrNumbers[0][2] = 8;
        arrNumbers[1][0] = 56;
        arrNumbers[1][1] = 78;
        arrNumbers[1][2] = 59;
        arrNumbers[2][0] = 90;
        arrNumbers[2][1] = 12;
        arrNumbers[2][2] = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cột bạn muốn tính tổng");
        for (int[] number : arrNumbers) {
            for (int i : number) {
                System.out.print(i + "  |  ");
            }
            System.out.println();
        }
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arrNumbers[col-1].length; i++) {
            sum += arrNumbers[i][col-1];
        }
        System.out.println("sum: "+ sum);
    }
}
