package ThuVien;

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io


/**
 *
 * @author Bui Van Son
 */
public class Paper extends ThuVien {
    private int taiBan;

    public Paper(String maTaiLieu, String tenTaiLieu, String nxb, int taiBan) {
        super(maTaiLieu, tenTaiLieu, nxb);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

 

}
