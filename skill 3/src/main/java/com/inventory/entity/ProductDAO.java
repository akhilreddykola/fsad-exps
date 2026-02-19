package com.inventory.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    // CREATE
    public void addProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
        System.out.println("Added: " + product);
    }

    // READ
    public Product getProduct(Long id) {
        Session session = factory.openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }

    // UPDATE
    public void updateProduct(Long id, double price, int quantity) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            product.setPrice(price);
            product.setQuantity(quantity);
            session.update(product);
            tx.commit();
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Product not found with id: " + id);
        }
        session.close();
    }

    // DELETE
    public void deleteProduct(Long id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            session.delete(product);
            tx.commit();
            System.out.println("Deleted: " + product);
        } else {
            System.out.println("Product not found with id: " + id);
        }
        session.close();
    }
}
