package ma.enset.billingservice.entities;

import jakarta.persistence.*;
import ma.enset.billingservice.model.Product;

@Entity
public class ProductItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private double price;
    private Long productID;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
}
