import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io

/**
 * @author Bui Van Son
 */
class MyUser implements IUser {

    @Override
    public int f1(List<User> t) {
        int maxStatus = Integer.MIN_VALUE;
        for (User user : t) {
            if (Character.isDigit(user.getName().charAt(1))) {
                maxStatus = Math.max(maxStatus, user.getStatus());
            }
        }
        return maxStatus;
    }

    @Override
    public void f2(List<User> t) {
        if (t.size() >= 6) {
            Collections.reverse(t.subList(3, 6));
        }
    }

    @Override
    public void f3(List<User> t) {
        int maxStatus = Integer.MIN_VALUE; // Khởi tạo giá trị trạng thái tối đa
        User maxUser = null; // Khởi tạo phần tử có trạng thái tối đa
        for (User user : t) {
            // Kiểm tra và cập nhật phần tử có trạng thái tối đa
            if (user.getStatus() > maxStatus) {
                maxStatus = user.getStatus();
                maxUser = user;
            }
        }
        // Đổi tên phần tử đầu tiên nếu phần tử có trạng thái tối đa tồn tại và danh sách không rỗng
        if (maxUser != null && !t.isEmpty()) {
            t.get(0).setName(maxUser.getName());
        }
    }
}
