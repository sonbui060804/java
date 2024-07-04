

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class Lift {
    private String label;
    private int load;

    // Default constructor
    public Lift() {
        this.label = "";
        this.load = 0;
    }

    // Parameterized constructor
    public Lift(String label, int load) {
        this.label = label;
        this.load = load;
    }

    // Getter for label
    public String getLabel() {
        return label;
    }

    // Getter for load
    public int getLoad() {
        return load;
    }

    // Setter for label
    public void setLabel(String label) {
        this.label = label;
    }

    // Setter for load
    public void setLoad(int load) {
        this.load = load;
    }
}
