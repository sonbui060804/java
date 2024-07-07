

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class Wood {
 private String source;
 private int year;       

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        if (source != null && source.length() > 0) {
            return source.substring(0, source.length() - 1);
        }
        return source;
    }

   

    public void setSource(String source) {
        this.source = source;
    }

    public int getYear() {
        return year;
    }

   public void setYear(int newYear) {
        this.year = newYear - this.year;
    }
 
}
