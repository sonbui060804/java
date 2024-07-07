

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
 class IString implements IString {

    @Override
    public int f1(String str) {
        // Đếm số lượng ký tự alphabet đứng riêng lẻ
        String[] parts = str.split(" ");
        int count = 0;
        for (String part : parts) {
            if (part.matches("[a-zA-Z]")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        // Trích xuất từ đầu tiên
        String[] parts = str.split(" ");
        return parts[0];
    }
}
