import java.util.*;  // Import toàn bộ các lớp trong gói java.util
import java.io.*;    // Import toàn bộ các lớp trong gói java.io

/**
 * 
 * 
 * @author Bui Van Son
 */
public class MyString implements IString {

    /**
     * Phương thức f1 để đếm số từ thỏa mãn điều kiện là từ đó là palindrome và chứa đúng 3 chữ số
     * 
     * @param str Chuỗi đầu vào
     * @return Số lượng từ thỏa mãn điều kiện
     */
    public int f1(String str) {
        int count = 0; // Khởi tạo biến đếm
        String[] words = str.split(" "); // Chia chuỗi thành các từ dựa trên dấu cách
        for (String word : words) { // Duyệt qua từng từ trong mảng
            if (isPalindrome(word) && hasThreeDigits(word)) { // Kiểm tra nếu từ là palindrome và chứa đúng 3 chữ số
                count++; // Tăng biến đếm nếu thỏa mãn điều kiện
            }
        }
        return count; // Trả về kết quả
    }

    /**
     * Phương thức f2 để xử lý chuỗi, giữ lại các ký tự xuất hiện ở vị trí chẵn và có số lần xuất hiện là số chẵn
     * 
     * @param str Chuỗi đầu vào
     * @return Chuỗi kết quả sau khi xử lý
     */
    @Override
    public String f2(String str) {
        StringBuilder result = new StringBuilder(); // Khởi tạo StringBuilder để lưu trữ kết quả
        Map<Character, Integer> charCount = new HashMap<>(); // Khởi tạo HashMap để lưu trữ số lượng ký tự

        // Đếm số lượng xuất hiện của từng ký tự
        for (char ch : str.toCharArray()) { // Duyệt qua từng ký tự trong chuỗi
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1); // Tăng số lượng xuất hiện của ký tự
        }

        // Duyệt qua chuỗi để lấy các ký tự ở vị trí chẵn và số lần xuất hiện là chẵn
        for (int i = 0; i < str.length(); i++) { // Duyệt qua từng ký tự trong chuỗi
            char ch = str.charAt(i); // Lấy ký tự tại vị trí i
            int count = charCount.get(ch); // Lấy số lần xuất hiện của ký tự
            if (count % 2 == 0) { // Kiểm tra số lần xuất hiện của ký tự có phải là số chẵn
                if (i % 2 == 0) { // Kiểm tra vị trí của ký tự trong chuỗi có phải là vị trí chẵn
                    result.append(ch); // Nối ký tự vào kết quả
                }
            }
        }
        return result.toString(); // Trả về chuỗi kết quả
    }

    /**
     * Kiểm tra xem từ có phải là palindrome hay không
     * 
     * @param word Từ cần kiểm tra
     * @return true nếu từ là palindrome, ngược lại false
     */
    private boolean isPalindrome(String word) {
        int left = 0; // Khởi tạo chỉ số bên trái
        int right = word.length() - 1; // Khởi tạo chỉ số bên phải
        while (left < right) { // Duyệt từ hai đầu vào giữa
            if (word.charAt(left) != word.charAt(right)) { // Nếu ký tự tại hai đầu không giống nhau
                return false; // Trả về false
            }
            left++; // Tăng chỉ số bên trái
            right--; // Giảm chỉ số bên phải
        }
        return true; // Trả về true nếu là palindrome
    }

    /**
     * Kiểm tra xem từ có chứa đúng 3 chữ số hay không
     * 
     * @param word Từ cần kiểm tra
     * @return true nếu từ chứa đúng 3 chữ số, ngược lại false
     */
    private boolean hasThreeDigits(String word) {
        int digitCount = 0; // Khởi tạo biến đếm số chữ số
        for (char ch : word.toCharArray()) { // Duyệt qua từng ký tự trong từ
            if (Character.isDigit(ch)) { // Nếu ký tự là chữ số
                digitCount++; // Tăng biến đếm
            }
        }
        return digitCount == 3; // Trả về true nếu số chữ số bằng 3, ngược lại false
    }
}

// Giao diện IString (giả định rằng nó tồn tại)
interface IString {
    String f2(String str); // Định nghĩa phương thức f2 cần được thực hiện bởi lớp MyString
}
