package danhsach;

import danhsach.Phone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PhoneBook extends Phone {
    // Danh sách để lưu trữ các số điện thoại
    private List<String> phoneList;

    // Constructor khởi tạo danh sách phoneList
    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    // Phương thức thêm số điện thoại vào danh bạ
    @Override
    void insertPhone(String name, String phone) {
        // Duyệt qua danh sách để kiểm tra tên người dùng đã tồn tại hay chưa
        for (int i = 0; i < phoneList.size(); i++) {
            String entry = phoneList.get(i);
            // Nếu tên người dùng đã tồn tại
            if (entry.startsWith(name + ":")) {
                // Nếu số điện thoại mới khác với số hiện có, thêm số mới vào sau số hiện có
                if (!entry.contains(phone)) {
                    phoneList.set(i, entry + " : " + phone);
                }
                return;
            }
        }
        // Nếu tên người dùng chưa tồn tại, thêm người dùng mới cùng số điện thoại vào danh sách
        phoneList.add(name + ": " + phone);
    }

    // Phương thức xóa số điện thoại khỏi danh bạ
    @Override
    void removePhone(String name) {
        // Xóa người dùng cùng các số điện thoại có tên tương ứng
        phoneList.removeIf(entry -> entry.startsWith(name + ":"));
    }

    // Phương thức cập nhật số điện thoại trong danh bạ
    @Override
    void updatePhone(String name, String newphone) {
        // Duyệt qua danh sách để tìm người dùng cần cập nhật
        for (int i = 0; i < phoneList.size(); i++) {
            String entry = phoneList.get(i);
            // Nếu tìm thấy người dùng
            if (entry.startsWith(name + ":")) {
                // Cập nhật số điện thoại mới cho người dùng
                phoneList.set(i, name + ": " + newphone);
                return;
            }
        }
    }

    // Phương thức tìm kiếm số điện thoại theo tên
    @Override
    void searchPhone(String name) {
        // Duyệt qua danh sách để tìm người dùng
        for (String entry : phoneList) {
            if (entry.startsWith(name + ":")) {
                // Nếu tìm thấy, in ra số điện thoại của người dùng
                System.out.println(entry);
                return;
            }
        }
        // Nếu không tìm thấy, thông báo không tìm thấy người dùng
        System.out.println("Không tìm thấy người dùng: " + name);
    }

    // Phương thức sắp xếp danh bạ theo tên người dùng
    @Override
    void sort() {
        // Sử dụng Collections.sort và Comparator để sắp xếp danh bạ
        Collections.sort(phoneList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(":")[0].compareTo(o2.split(":")[0]);
            }
        });
    }

    // Phương thức hiển thị danh sách số điện thoại
    public void displayPhoneList() {
        for (String entry : phoneList) {
            System.out.println(entry);
        }
    }
}
