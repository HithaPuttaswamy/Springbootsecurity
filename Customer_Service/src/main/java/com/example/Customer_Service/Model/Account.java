package com.example.Customer_Service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;


@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "account_details")
public class Account {

@Id
    private int accountId;

    private  int customerId;

    private AccountType accountType;

    private String accountName;
    private Date createdDate;

    private Double accountBalance;
    public Account(int customerId, AccountType accountType, String accountName, Date createdDate, Double accountBalance) {
        this.customerId = customerId;
        this.accountType = accountType;
        this.accountName = accountName;
        this.createdDate = createdDate;
        this.accountBalance = accountBalance;
    }


}
