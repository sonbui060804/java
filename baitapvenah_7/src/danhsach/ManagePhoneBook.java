package danhsach;



import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        // Tạo đối tượng PhoneBook để quản lý danh bạ
        PhoneBook phoneBook = new PhoneBook();
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu quản lý danh bạ
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc và bỏ qua ký tự xuống dòng

            switch (choice) {
                case 1:
                    // Nhập tên và số điện thoại để thêm vào danh bạ
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    // Nhập tên để xóa khỏi danh bạ
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    // Nhập tên và số điện thoại mới để cập nhật
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new phone: ");
                    String newphone = scanner.nextLine();
                    phoneBook.updatePhone(name, newphone);
                    break;
                case 4:
                    // Nhập tên để tìm kiếm trong danh bạ
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    // Sắp xếp danh bạ và hiển thị
                    phoneBook.sort();
                    System.out.println("Sorted phone list:");
                    phoneBook.displayPhoneList();
                    break;
                case 6:
                    // Thoát chương trình
                    System.out.println("Exiting...");
                    break;
                default:
                    // Thông báo nếu lựa chọn không hợp lệ
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        // Đóng Scanner
        scanner.close();
    }
}

