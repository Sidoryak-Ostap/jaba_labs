package com.bobocode.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email")
public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private Sex sex;
    private LocalDate creationDate;
    private BigDecimal balance = BigDecimal.ZERO;


    public LocalDate getBirthday(){
        return this.birthday;
    }

    public String getEmail(){
        return this.email;
    }

    public BigDecimal getBalance(){
        return this.balance;
    }

    public Long getId(){
        return this.id;
    }

    public String getFirstName(){
        return  this.firstName;
    }

    public String getLastName(){
        return  this.lastName;
    }

    public LocalDate getCreationDate(){
        return this.creationDate;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public boolean isMale(){
        return this.sex == Sex.MALE;
    }


}

