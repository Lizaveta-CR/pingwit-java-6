package com.pingwit.spring.les_6.house.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer floor;
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany(mappedBy = "house")
    private List<Elevator> elevators = new ArrayList<>();
    @ManyToMany
    @JoinTable(
        name = "houses_residents",
        joinColumns = @JoinColumn(name = "house_id"),
        inverseJoinColumns = @JoinColumn(name = "resident_id")
    )
    private List<HouseResident> houseResidents = new ArrayList<>();
}
/*
houses(
id pk,
floor,
address_id fk,
houseType
)
 */
