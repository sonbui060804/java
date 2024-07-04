

import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
public class Lift {
String Label ;
int type ;

    public Lift() {
    }

    public Lift(String Label, int type) {
        this.Label = Label;
        this.type = type;
    }

    public String getLabel() {
        return Label;
    }

    public int getType() {
        return type;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lift{" + "Label=" + Label + ", type=" + type + '}';
    }
}
