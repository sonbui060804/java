package models;

import java.util.List;

public class Order {

    private String orderId;
    private String dateCreated;
    private Customer customer;
    private List<Product> listProduct;

    public Order(String orderId, String dateCreated, Customer customer, List<Product> listProduct) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.customer = customer;
        this.listProduct = listProduct;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void addProduct(Product product) {
        this.listProduct.add(product);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Date Created: " + dateCreated + ", Customer: " + customer.toString() + ", Products: " + listProduct.toString();
    }
}