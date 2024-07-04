import java.util.List;

public class MyLift implements ILift {

    // Method to calculate the maximum load of elements whose label has the prime length
   @Override
public int f1(List<Lift> t) {
    int maxLoad = -1; // Biến lưu trữ tải trọng tối đa ban đầu
    for (Lift lift : t) { // Duyệt qua danh sách các Lift
        if (isPrime(lift.getLabel().length())) { // Kiểm tra nếu độ dài của nhãn là số nguyên tố
            maxLoad = Math.max(maxLoad, lift.getLoad()); // Cập nhật tải trọng tối đa
        }
    }
    return maxLoad; // Trả về tải trọng tối đa tìm thấy
}

    // Method to reverse the first 5 elements in the list
    @Override
public void f2(List<Lift> t) {
    int n = Math.min(5, t.size()); // Số lượng phần tử cần đảo ngược, không quá 5 hoặc nhỏ hơn nếu danh sách ít hơn 5 phần tử
    for (int i = 0; i < n / 2; i++) { // Duyệt qua nửa đầu của 5 phần tử đầu tiên
        Lift temp = t.get(i); // Lưu trữ tạm thời phần tử hiện tại
        t.set(i, t.get(n - i - 1)); // Đổi chỗ phần tử hiện tại với phần tử đối diện ở nửa sau
        t.set(n - i - 1, temp); // Đặt phần tử đối diện vào vị trí hiện tại
    }
}


    // Method to remove the second element having load < 20
    @Override
public void f3(List<Lift> t) {
    int count = 0; // Biến đếm số lượng phần tử có tải trọng nhỏ hơn 20
    for (int i = 0; i < t.size(); i++) { // Duyệt qua danh sách các Lift
        if (t.get(i).getLoad() < 20) { // Kiểm tra nếu tải trọng của phần tử nhỏ hơn 20
            count++; // Tăng biến đếm
            if (count == 2) { // Kiểm tra nếu đây là phần tử thứ hai
                t.remove(i); // Loại bỏ phần tử khỏi danh sách
                break; // Kết thúc vòng lặp
            }
        }
    }
}

   // Helper method to check if a number is prime
private boolean isPrime(int num) {
    if (num <= 1) { // Kiểm tra nếu số nhỏ hơn hoặc bằng 1
        return false; // Trả về false vì 0 và 1 không phải là số nguyên tố
    }
    for (int i = 2; i <= Math.sqrt(num); i++) { // Duyệt từ 2 đến căn bậc hai của số đó
        if (num % i == 0) { // Kiểm tra nếu số chia hết cho i
            return false; // Trả về false nếu tìm thấy ước khác 1 và chính nó
        }
    }
    return true; // Trả về true nếu số không có ước khác 1 và chính nó
}
}
