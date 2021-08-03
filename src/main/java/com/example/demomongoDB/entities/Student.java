package com.example.demomongoDB.entities;

import com.example.demomongoDB.enums.Gender;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {

    @Id
    private String id;

    @Field(name="FIRSTNAME")
    @Indexed(unique = true)
    private String firstName;
    @Field(name="LASTNAME")
    private String lastName;
    @Field(name="EMAIL")
    private String email;
    @Field(name="GENDER")
    private Gender gender;
    @Field(name="ADDRESS")
    private Address address;
    @Field(name="AMOUNT")
    private BigDecimal totalSpentInBooks;
    @Field(name="CREATDATE")
    private LocalDateTime created;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, Gender gender, Address address, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getTotalSpentInBooks() {
        return totalSpentInBooks;
    }

    public void setTotalSpentInBooks(BigDecimal totalSpentInBooks) {
        this.totalSpentInBooks = totalSpentInBooks;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
