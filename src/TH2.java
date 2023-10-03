import java.util.*;

public class TH2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đối tượng bạn muốn tìm kiếm");
        String searchStudent = scanner.nextLine();
        boolean check = false;
        for (String student :students) {
            if (student.toLowerCase().contains(searchStudent.toLowerCase())){
                check = true;
                System.out.println("Tìm thấy học sinh " + student);
            }
        }
        if (!check){
            System.out.println("Không tìm thấy học sinh " + searchStudent);
        }
    }
}