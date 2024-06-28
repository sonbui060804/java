package ThuVien;

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io


/**
 *
 * @author Bui Van Son
 */
public class ThuVien {
 private String maTaiLieu;
    private String tenTaiLieu;
    private String nxb;

    public ThuVien(String maTaiLieu, String tenTaiLieu, String nxb) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.nxb = nxb;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public String getNxb() {
        return nxb;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
}
