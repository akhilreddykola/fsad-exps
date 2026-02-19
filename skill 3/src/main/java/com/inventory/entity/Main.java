package com.inventory.entity;

public class Main {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        // CREATE
        dao.addProduct(new Product("Laptop", "Gaming Laptop", 75000, 10));
        dao.addProduct(new Product("Mouse", "Wireless Mouse", 500, 50));

        // READ
        Product p = dao.getProduct(1L);
        System.out.println("Retrieved: " + p);

        // UPDATE
        dao.updateProduct(1L, 70000, 8);

        // DELETE
        dao.deleteProduct(2L);
    }
}
