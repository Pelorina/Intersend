package com.example.Intersend.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String accountName;
}
