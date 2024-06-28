package Controller;

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
import model.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bui Van Son
 */
public class main {
private static ArrayList<SinhVien> listSinhVien =new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xoá sinh viên");
            System.out.println("3. In thông tin sinh viên");
            System.out.println("4. Sửa thông tin sinh viên");
            System.out.println("5. In thông tin toàn bộ sinh viên nam");
            System.out.println("6. In thông tin toàn bộ sinh viên nữ");
            System.out.println("7. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    xoaSinhVien();
                    break;
                case 3:
                    inThongTinSinhVien();
                    break;
                case 4:
                    suaThongTinSinhVien();
                    break;
                case 5:
                    inSinhVienNam();
                    break;
                case 6:
                    inSinhVienNu();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void themSinhVien() {
        System.out.print("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính sinh viên (Nam/Nữ): ");
        String gender = scanner.nextLine();
        System.out.print("Nhập chuyên ngành sinh viên: ");
        String major = scanner.nextLine();

        SinhVien sinhVien = new SinhVien(id, name, gender, major);
        listSinhVien.add(sinhVien);
        System.out.println("Đã thêm sinh viên.");
    }

    private static void xoaSinhVien() {
        System.out.print("Nhập mã sinh viên cần xoá: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (SinhVien sv : listSinhVien) {
            if (sv.getId().equals(id)) {
                listSinhVien.remove(sv);
                System.out.println("Đã xoá sinh viên.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã số này.");
        }
    }

    private static void inThongTinSinhVien() {
        System.out.print("Nhập mã sinh viên cần in thông tin: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (SinhVien sv : listSinhVien) {
            if (sv.getId().equals(id)) {
                System.out.println(sv);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã số này.");
        }
    }

    private static void suaThongTinSinhVien() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (SinhVien sv : listSinhVien) {
            if (sv.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giới tính mới (Nam/Nữ): ");
                String gender = scanner.nextLine();
                System.out.print("Nhập chuyên ngành mới: ");
                String major = scanner.nextLine();

                sv.setName(name);
                sv.setGender(gender);
                sv.setMajor(major);
                System.out.println("Đã cập nhật thông tin sinh viên.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã số này.");
        }
    }

    private static void inSinhVienNam() {
        System.out.println("Danh sách sinh viên nam:");
        for (SinhVien sv : listSinhVien) {
            if (sv.getGender().equalsIgnoreCase("Nam")) {
                System.out.println(sv);
            }
        }
    }

    private static void inSinhVienNu() {
        System.out.println("Danh sách sinh viên nữ:");
        for (SinhVien sv : listSinhVien) {
            if (sv.getGender().equalsIgnoreCase("Nữ")) {
                System.out.println(sv);
            }
        }
    }
}

