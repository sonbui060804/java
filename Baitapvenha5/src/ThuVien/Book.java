package ThuVien;

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io


/**
 *
 * @author Bui Van Son
 */
public class Book extends ThuVien {
    private int soTrang;

    public Book(String maTaiLieu, String tenTaiLieu, String nxb, int soTrang) {
        super(maTaiLieu, tenTaiLieu, nxb);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }


}
