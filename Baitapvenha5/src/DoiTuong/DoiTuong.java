package DoiTuong;

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io


/**
 *
 * @author Bui Van Son
 */
public class DoiTuong {
 private String maDoiTuong;
    private String tenDoiTuong;
    private boolean gioiTinh;
    private String yob;

    @Override
    public String toString() {
        return "DoiTuong{" + "maDoiTuong=" + maDoiTuong + ", tenDoiTuong=" + tenDoiTuong + ", gioiTinh=" + gioiTinh + ", yob=" + yob + '}';
    }

    public DoiTuong() {
    }

    public DoiTuong(String maDoiTuong, String tenDoiTuong, boolean gioiTinh, String yob) {
        this.maDoiTuong = maDoiTuong;
        this.tenDoiTuong = tenDoiTuong;
        this.gioiTinh = gioiTinh;
        this.yob = yob;
    }
}
