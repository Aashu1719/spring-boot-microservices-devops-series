package com.aashu.learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "STUDENT_DTLS")
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Student
{
    @Id
    private Integer id;
    private String name;
    private Long studentRank;
    private String gender;

    @CreationTimestamp
    private LocalDate createDate;

    @UpdateTimestamp
    private LocalDate updateDate;

    private String activeSw;

    public Student(Integer id, String name, Long studentRank, String gender, String activeSw) {
        this.id = id;
        this.name = name;
        this.studentRank = studentRank;
        this.gender = gender;
        this.activeSw = activeSw;
    }
}
