

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class SpecLift  extends Lift{
private int load; 

    public SpecLift() {
    }

    public SpecLift(int load) {
        this.load = load;
    }

    public SpecLift( String Label, int type, int load) {
        super(Label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return getLabel()+","+ load +","+getType();
    }

    public void setData() {
        StringBuilder newLabel = new StringBuilder();
        for (int i = 0; i < getLabel().length(); i++) {
            if (i%2 !=0){
                newLabel.append(getLabel().charAt(i));
            }
            
        }
     
    }

    public int getValue() {
        if (!getLabel().contains(Integer.toString(getType()))) {
            return load;
        } else {
            return load + getType();
        }
    }
}
  
   
   


