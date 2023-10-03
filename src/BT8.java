import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        final String text = "hello world";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ki tu muon kiem tra: ");
        String textSearch = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == textSearch.charAt(0)){
                count += 1;
            }
        }
        System.out.println("Kí tự " + textSearch + " xuất hiện " + count + " lần");
    }
}
