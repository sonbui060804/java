package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import models.Customer;
import models.Order;
import models.Product;

public class OMS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> listProduct = new ArrayList<>();
        ArrayList<Order> listOrder = new ArrayList<>();
        ArrayList<Customer> listCustomer = new ArrayList<>();
        int choice;
        do {
            System.out.println("___MENU___");
            System.out.println("1. Add a new product to the Store.");
            System.out.println("2. Update price for a particular product.");
            System.out.println("3. A list of all available products in the Store.");
            System.out.println("4. Create a new Order.");
            System.out.println("5. Print information of an Order by Order ID.");
            System.out.println("6. Sort all products by product price as ascending");
            System.out.println("7. Print information of all Customer (Name, Sex, Language)");
            System.out.println("0. Exit");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addNewProduct(listProduct, sc);
                    break;
                case 2:
                    updatePrice(listProduct, sc);
                    break;
                case 3:
                    printAll(listProduct);
                    break;
                case 4:
                    createOrder(listOrder, listCustomer, listProduct, sc);
                    break;
                case 5:
                    printInfoOrder(listOrder, sc);
                    break;
                case 6:
                    sortProducts(listProduct);
                    break;
                case 7:
                    printAllCustomer(listCustomer);
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Your selection is invalid!!!");
                    break;
            }
        } while (choice != 0);
    }

    public static void addNewProduct(ArrayList<Product> listProduct, Scanner sc) {
        System.out.println("ENTER PRODUCT INFORMATION");
        System.out.print("Name: ");
        String productName = sc.nextLine();
        System.out.print("Id: ");
        String productId = sc.nextLine();
        for (Product i : listProduct) {
            if (i.getProductId().equals(productId)) {
                System.out.println("ID already exists in the list!!!");
                return;
            }
        }
        double productPrice;
        while (true) {
            System.out.print("Price: ");
            if (sc.hasNextDouble()) {
                productPrice = sc.nextDouble();
                sc.nextLine();
                break;
            } else {
                System.out.println("Invalid!!! Please enter a valid price.");
                sc.nextLine();
            }
        }

        listProduct.add(new Product(productName, productId, productPrice));
        System.out.println("The product has been added to the list!");
    }

    public static void updatePrice(ArrayList<Product> listProduct, Scanner sc) {
        System.out.println("Update new price for a particular product.");
        System.out.print("Enter the product id you want to update the price for: ");
        String productId = sc.nextLine();
        boolean find = false;
        for (Product i : listProduct) {
            if (i.getProductId().equals(productId)) {
                double newPrice;
                while (true) {
                    System.out.print("Enter the new price: ");
                    if (sc.hasNextDouble()) {
                        newPrice = sc.nextDouble();
                        sc.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid!!! Please enter a valid price.");
                        sc.nextLine();
                    }
                }
                i.setProductPrice(newPrice);
                System.out.println("Updated product price successfully!!!");
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("No products found with ID: " + productId);
        }
    }

    public static void printAll(ArrayList<Product> listProduct) {
        System.out.println("A list of all available products in the Store.");
        for (Product i : listProduct) {
            System.out.println(i.toString());
        }
    }

    public static void createOrder(ArrayList<Order> listOrder, ArrayList<Customer> listCustomer, ArrayList<Product> listProduct, Scanner sc) {
        System.out.println("ENTER ORDER INFORMATION");
        System.out.print("Id: ");
        String orderId = sc.nextLine();
        for (Order i : listOrder) {
            if (i.getOrderId().equals(orderId)) {
                System.out.println("ID already exists in the list!!!");
                return;
            }
        }
        System.out.print("Date Created: ");
        String dateCreated = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Sex: ");
        String sex = sc.nextLine();
        System.out.print("Country(USA/VN/JP): ");
        String country = sc.nextLine();

        List<Product> productList = new ArrayList<>();
        String continueAdding;
        do {
            System.out.print("Enter product ID to add to the order: ");
            String productId = sc.nextLine();
            Product product = findProductById(listProduct, productId);
            if (product != null) {
                productList.add(product);
                System.out.println("Product added to the order!");
            } else {
                System.out.println("Product not found!");
            }
            System.out.print("Do you want to add another product? (yes/no): ");
            continueAdding = sc.nextLine();
        } while (continueAdding.equalsIgnoreCase("yes"));

        Customer newCustomer = new Customer(country, name, age, sex);
        listCustomer.add(newCustomer);
        Order newOrder = new Order(orderId, dateCreated, newCustomer, productList);
        listOrder.add(newOrder);

        System.out.println("Order created successfully!!!");
    }
    
    private static Product findProductById(ArrayList<Product> listProduct, String productId) {
        for (Product product : listProduct) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public static void printInfoOrder(ArrayList<Order> listOrder, Scanner sc) {
        System.out.print("Enter the order ID you want to print: ");
        String orderId = sc.nextLine();
        boolean find = false;
        for (Order i : listOrder) {
            if (i.getOrderId().equals(orderId)) {
                System.out.println(i.toString());
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Order with ID " + orderId + " not found.");
        }
    }

    public static void sortProducts(ArrayList<Product> listProduct) {
        Collections.sort(listProduct);
        System.out.println("Products are sorted by price (ascending):");
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

    public static void printAllCustomer(ArrayList<Customer> listCustomer) {
        System.out.println("Print information of all Customer (Name, Sex, Language)");
        for (Customer i : listCustomer) {
            System.out.println(i.toString());
        }
    }
}