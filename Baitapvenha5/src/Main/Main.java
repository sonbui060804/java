// Main.java
import DoiTuong.*;
import ThuVien.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listHocSinh = new ArrayList<>();
        ArrayList<Teacher> listGiaoVien = new ArrayList<>();
        ArrayList<Book> listBooks = new ArrayList<>();
        ArrayList<Paper> listPapers = new ArrayList<>();
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1: Thêm Học Sinh");
            System.out.println("2: Thêm Giáo Viên");
            System.out.println("3: Thêm Book");
            System.out.println("4: Thêm Paper");
            System.out.println("5: Hiển thị ra tất cả các Đối Tượng");
            System.out.println("6: Hiển thị ra tất cả các sách hoặc paper có trong thư viện");
            System.out.println("7: Thoát");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Thêm Học Sinh
                    System.out.println("Nhập mã học sinh:");
                    String maHS = sc.nextLine();
                    System.out.println("Nhập tên học sinh:");
                    String tenHS = sc.nextLine();
                    System.out.println("Nhập giới tính (true/false):");
                    boolean gioiTinhHS = sc.nextBoolean();
                    sc.nextLine(); // Consume newline
                    System.out.println("Nhập năm sinh:");
                    String yobHS = sc.nextLine();
                    System.out.println("Nhập lớp:");
                    String lopHS = sc.nextLine();
                    System.out.println("Nhập ban:");
                    String banHS = sc.nextLine();
                    Student hs = new Student(maHS, tenHS, gioiTinhHS, yobHS, lopHS, banHS);
                    listHocSinh.add(hs);
                    break;
                case 2:
                    // Thêm Giáo Viên
                    System.out.println("Nhập mã giáo viên:");
                    String maGV = sc.nextLine();
                    System.out.println("Nhập tên giáo viên:");
                    String tenGV = sc.nextLine();
                    System.out.println("Nhập giới tính (true/false):");
                    boolean gioiTinhGV = sc.nextBoolean();
                    sc.nextLine(); // Consume newline
                    System.out.println("Nhập năm sinh:");
                    String yobGV = sc.nextLine();
                    System.out.println("Nhập môn dạy:");
                    String monDayGV = sc.nextLine();
                    System.out.println("Nhập trình độ:");
                    String trinhDoGV = sc.nextLine();
                    Teacher gv = new Teacher(maGV, tenGV, gioiTinhGV, yobGV, monDayGV, trinhDoGV);
                    listGiaoVien.add(gv);
                    break;
                case 3:
                    // Thêm Book
                    System.out.println("Nhập mã tài liệu:");
                    String maTL = sc.nextLine();
                    System.out.println("Nhập tên tài liệu:");
                    String tenTL = sc.nextLine();
                    System.out.println("Nhập nhà xuất bản:");
                    String nxb = sc.nextLine();
                    System.out.println("Nhập số trang:");
                    int soTrang = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    Book book = new Book(maTL, tenTL, nxb, soTrang);
                    listBooks.add(book);
                    break;
                case 4:
                    // Thêm Paper
                    System.out.println("Nhập mã tài liệu:");
                    String maTL2 = sc.nextLine();
                    System.out.println("Nhập tên tài liệu:");
                    String tenTL2 = sc.nextLine();
                    System.out.println("Nhập nhà xuất bản:");
                    String nxb2 = sc.nextLine();
                    System.out.println("Nhập số lần tái bản:");
                    int taiBan = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    Paper paper = new Paper(maTL2, tenTL2, nxb2, taiBan);
                    listPapers.add(paper);
                    break;
                case 5:
                    // Hiển thị ra tất cả các Đối Tượng
                    System.out.println("Danh sách Học Sinh:");
                    for (Student student : listHocSinh) {
                        System.out.println(student);
                    }
                    System.out.println("Danh sách Giáo Viên:");
                    for (Teacher teacher : listGiaoVien) {
                        System.out.println(teacher);
                    }
                    break;
                case 6:
                    // Hiển thị ra tất cả các sách hoặc paper có trong thư viện
                    System.out.println("Danh sách Sách:");
                    for (Book b : listBooks) {
                        System.out.println(b);
                    }
                    System.out.println("Danh sách Paper:");
                    for (Paper p : listPapers) {
                        System.out.println(p);
                    }
                    break;
                case 7:
                    // Thoát
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        }
    }
}
