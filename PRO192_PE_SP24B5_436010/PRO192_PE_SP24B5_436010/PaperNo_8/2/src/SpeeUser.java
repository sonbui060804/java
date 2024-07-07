

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class SpeeUser extends User{
 private String address;

    public SpeeUser() {
    }

    public SpeeUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
        
        
    }

    @Override
    public String toString() {
          return super.name+","+ address +","+super.status;
    }

    

    public void setData(String address) {
        setName(getName()+" "+address);
    }

   

   
  public String getValue() {
        if (getStatus() == 1) {
            return getName() + " admin";
        } else {
            return getName() + " user";
        }
    }

}
