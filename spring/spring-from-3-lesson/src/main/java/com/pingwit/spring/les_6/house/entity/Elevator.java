package com.pingwit.spring.les_6.house.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "elevators")
public class Elevator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producer;
    private String serialNo;
    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;
}
/*
elevators(
 id serial pk,
 producer vc,
 serialNo vc,
 house_id fk
)
 */