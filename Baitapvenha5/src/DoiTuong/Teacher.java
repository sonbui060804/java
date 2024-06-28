// Teacher.java
package DoiTuong;

public class Teacher extends DoiTuong {
    private String monDay;
    private String trinhDo;

    public Teacher(String maDoiTuong, String tenDoiTuong, boolean gioiTinh, String yob, String monDay, String trinhDo) {
        super(maDoiTuong, tenDoiTuong, gioiTinh, yob);
        this.monDay = monDay;
        this.trinhDo = trinhDo;
    }

    // Getter và Setter

    public String getMonDay() {
        return monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
}
