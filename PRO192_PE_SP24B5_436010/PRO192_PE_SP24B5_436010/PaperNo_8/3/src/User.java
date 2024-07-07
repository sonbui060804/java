import java.util.List;
import java.util.Collections;

// Define the User class
class User {
    private String name;
    private int status;

    // Constructor
    public User(String name, int status) {
        this.name = name;
        this.status = status;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "(" + name + "," + status + ")";
    }
}