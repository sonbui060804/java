package danhsach;



import java.lang.*;  // Import toàn bộ java.lang (mặc định, không cần thiết)
import java.util.*;  // Import toàn bộ java.util
import java.io.*;    // Import toàn bộ java.io
/**
 *
 * @author Bui Van Son
 */
abstract class Phone {

abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newphone);
    abstract void searchPhone(String name);
    abstract void sort();
    

}
