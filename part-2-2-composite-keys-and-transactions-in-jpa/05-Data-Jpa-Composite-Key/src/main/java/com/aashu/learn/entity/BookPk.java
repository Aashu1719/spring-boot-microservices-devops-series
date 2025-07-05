package com.aashu.learn.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
@ToString
@AllArgsConstructor
public class BookPk implements Serializable
{
    private Integer bookId;
    private String bookName;
}
