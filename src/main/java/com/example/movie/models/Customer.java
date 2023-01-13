package com.example.movie.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    @NotBlank
    @Size(max = 500)
    private String firstName;

    @Column(name = "LAST_NAME")
    @NotBlank
    @Size(max = 500)
    private String lastName;

    @Email
    @NotBlank
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSSWORD")
    @NotBlank
    private String password;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Purchase> purchaseList = new ArrayList<>();

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String email, List<Purchase> purchaseList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.purchaseList = purchaseList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
