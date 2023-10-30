package com.pingwit.spring.les_6.house.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "residents")
public class HouseResident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

/*
        customers(
        order_id
        )

        orders(
            1, 1000, time
        )
        products(
        ...
        )

        orders_products (
            order_id,
            product_id,
            amount,
            totalAm
        )
 */
