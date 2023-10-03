public class BT4 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][2];
        numbers[0][0] = 5;
        numbers[0][1] = 34;
        numbers[1][0] = 56;
        numbers[1][1] = 78;
        numbers[2][0] = 90;
        numbers[2][1] = 12;
        numbers[3][0] = 34;
        numbers[3][1] = 56;

        int maxNumber = numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if (maxNumber < i) {
                    maxNumber = i;
                }
            }
        }
        System.out.println("maxNumber: " + maxNumber);
    }
}