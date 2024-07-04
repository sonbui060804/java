

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class House {
String type;
int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if (type.length()<3){
        return type;
    } else {
          String lastThreeChars =type.substring(type.length()-3);
          return new StringBuilder (lastThreeChars).reverse().toString() ;
        }
    }
    public int getArea() {
        return area;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(int area) {
        this.area = 3* area;
    }

}
