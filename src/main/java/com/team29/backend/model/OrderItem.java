package com.team29.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import com.team29.backend.model.*;


@Entity

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int orderItemId;
    @OneToOne
    private Product product;
    private double totalProductprice;
    private int productQuantity;
    @ManyToOne
    private Order order;
    public OrderItem(int orderItemId, Product product, double totalProductprice, int productQuantity, Order order) {
        this.orderItemId = orderItemId;
        this.product = product;
        this.totalProductprice = totalProductprice;
        this.productQuantity = productQuantity;
        this.order = order;
    }

    public OrderItem(){
        super();
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotalProductprice() {
        return totalProductprice;
    }

    public void setTotalProductprice(double totalProductprice) {
        this.totalProductprice = totalProductprice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductQuantity(Long quantity) {
    }

    public void setProduct(String name) {
    }

    




}
