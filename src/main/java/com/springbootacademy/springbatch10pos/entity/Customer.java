package com.springbootacademy.springbatch10pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name",length=100,nullable = false)
    private String customerName;

    @Column(name = "customer_address",length =200)
    private String customerAddress;

    @Column(name = "customer_salery")
    private double customerSalery;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state",columnDefinition = "TINYINT default 0 ")
    private boolean activeStatus;
}