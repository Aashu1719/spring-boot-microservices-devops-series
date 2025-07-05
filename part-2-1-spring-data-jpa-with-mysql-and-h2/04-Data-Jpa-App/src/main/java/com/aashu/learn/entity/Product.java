package com.aashu.learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @TableGenerator(initialValue = 100, name = "pid", table="pid_seq_tbl")
//    @GeneratedValue(strategy = GenerationType.TABLE, generator="pid")
    private Integer productId;
    private String productName;
    private Double productPrice;
}
