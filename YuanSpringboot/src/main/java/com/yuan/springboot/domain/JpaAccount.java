package com.yuan.springboot.domain;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Entity
public class JpaAccount {
    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}